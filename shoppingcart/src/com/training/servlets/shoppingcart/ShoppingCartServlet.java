package com.training.servlets.shoppingcart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingCartServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		if(session.isNew()) {
			List<String> books = new ArrayList<String>();
			session.setAttribute("BooksBoughtSoFar", books);
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/shoppingcart.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String purchasedBook = req.getParameter("purchasedBook");
		String name = req.getParameter("name");
		
		System.out.println("Book purchased = " + purchasedBook);
		System.out.println("name = " + name);
		
		HttpSession session = req.getSession();
		
		if(session.isNew()) {
			List<String> books = new ArrayList<String>();
			session.setAttribute("BooksBoughtSoFar", books);
		} else {
			List<String> books = (List<String>) session.getAttribute("BooksBoughtSoFar");
			books.add(purchasedBook);
			
			System.out.println("Books bought so far " + books);
		}
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/shoppingcart.jsp");
		rd.forward(req, resp);
	}

}
