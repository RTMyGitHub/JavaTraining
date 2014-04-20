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

/**
 * Servlet implementation class AddToCart
 */
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		long id = Long.parseLong(request.getParameter("id"));
		
		HttpSession session = request.getSession();
		
		List<Long> cart = (List<Long>)session.getAttribute("cart");
		if(cart == null)
		{
			cart = new ArrayList<>();
			cart.add(id);
			
			session.setAttribute("cart", cart);
			
		}else{
			
			cart.add(id);				
			}
		
		RequestDispatcher rd = request.getRequestDispatcher("/listMovies");
		rd.forward(request, response);
	}

}
