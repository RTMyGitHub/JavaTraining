package com.training.java.redbox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.java.redbox.domain.Customer;
import com.training.java.redbox.domain.DAOException;
import com.training.java.redbox.domain.Movie;
import com.training.java.redbox.domain.MovieDAO;
import com.training.java.redbox.domain.MovieDAOJDBCImpl;
import com.training.java.redbox.domain.Orders;
import com.training.java.redbox.domain.OrdersDAO;
import com.training.java.redbox.domain.OrdersDAOJDBCImpl;

/**
 * Servlet implementation class CheckoutServlet
 */
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	HttpSession session = request.getSession();
	List<Long> cart = (List<Long>) session.getAttribute("cart");
	
	MovieDAO dao = new MovieDAOJDBCImpl();
	
	List<Movie> movies = new ArrayList<>();
	
	for(long id : cart){
		
		try {
			movies.add(dao.findByPrimaryKey(id));
			
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
							
		}
	
	request.setAttribute("moviesCart", movies);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Checkout.jsp");
	rd.forward(request, response);
			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		Customer customer = (Customer)session.getAttribute("customer");
		
		if(customer!=null){
		
		List<Long> ids = (List<Long>) session.getAttribute("cart");
		
		OrdersDAO dao = new OrdersDAOJDBCImpl();
		long orderNum = 0;
		
		
		try {
			orderNum = dao.createOrderNumber();
			
			for(long id : ids)
			{
			      Orders order = new Orders(orderNum, 0, customer.getCustomerId(), id, "Rented");
			     
			      dao.createOrders(order);
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
				
		session.invalidate();
		response.sendRedirect("/redbox/thankyou");
		
		}
		else{
			
			request.setAttribute("error", "Please login in order to checkout.");
			doGet(request, response);			
		}
				
	}

}
