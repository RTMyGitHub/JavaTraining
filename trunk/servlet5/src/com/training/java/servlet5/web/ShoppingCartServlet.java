package com.training.java.servlet5.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShoppingCartServlet
 */
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCartServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		boolean isNewSession = session.isNew();
		System.out.println("Is new session? " + isNewSession);
		
		String bookName = request.getParameter("bookName");
		
		PrintWriter out = response.getWriter();
		
		if(isNewSession)
		{
			List<String> books = new ArrayList<String>();
			books.add(bookName);
			
			session.setAttribute("booksBought", books);
			
			out.print("<h1> Welcome to our store, you just bought " + bookName);
		}
		else
		{
			List<String> booksBought = (List<String>) session.getAttribute("booksBought");
			booksBought.add(bookName);
			
			out.print("<h1> Welcome back, you bought..");
			out.println("<br/>");
			
			for(String current : booksBought)
			{
				out.println("Book = " + current);
				out.println("<br/>");
			}
		}
	}

}
