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

import com.training.java.redbox.domain.DAOException;
import com.training.java.redbox.domain.Movie;
import com.training.java.redbox.domain.MovieDAO;
import com.training.java.redbox.domain.MovieDAOJDBCImpl;

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
		List<Long> ids = (List<Long>) session.getAttribute("cart");
		
		List<Movie> movies = new ArrayList<>();
		
		MovieDAO dao = new MovieDAOJDBCImpl();
		
		for(long id : ids)
		{
			try {
				movies.add(dao.findByPrimaryKey(id));
			} catch (DAOException e) {
				e.printStackTrace();
			}
		}
		
		request.setAttribute("MoviesCart", movies);

		RequestDispatcher rd = request.getRequestDispatcher("/Checkout.jsp");
		rd.forward(request, response);
		
	}

}
