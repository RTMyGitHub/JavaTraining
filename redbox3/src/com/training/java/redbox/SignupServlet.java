package com.training.java.redbox;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.redbox.domain.Customer;
import com.training.java.redbox.domain.CustomerDAO;
import com.training.java.redbox.domain.CustomerDaoJdbcImpl;
import com.training.java.redbox.domain.DAOException;
import com.training.java.redbox.domain.MovieDAO;
import com.training.java.redbox.domain.MovieDAOJDBCImpl;

/**
 * Servlet implementation class SignupServlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Signup.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Customer customer = null;
		
		CustomerDAO dao = new CustomerDaoJdbcImpl();
		
		try {
			
			customer = dao.findCustomerByUsername(username);
						
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		if(customer==null){
			
			customer = new Customer(0, firstName, lastName);
			customer.setAddress(address);
			customer.setCity(city);
			customer.setState(state);
			customer.setZipCode(zip);
			customer.setUserName(username);
			customer.setPassword(password);
			
			try {
				dao.addCustomer(customer);
			} catch (DAOException e) {
				e.printStackTrace();
			}
		
			RequestDispatcher rd = request.getRequestDispatcher("/");
			rd.forward(request, response);
		
		}else{
			
			request.setAttribute("error", 1);
			doGet(request, response);
			
			/*RequestDispatcher rd = request.getRequestDispatcher("/error");
			rd.forward(request, response);	*/	
		}
		
	
	}

}
