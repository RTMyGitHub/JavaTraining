package com.training.java.servlet;

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
 * Servlet implementation class ShoppingCart
 */
public class ShoppingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String bookToBuy = request.getParameter("bookName");
		
		HttpSession session = request.getSession();
		
		PrintWriter out = response.getWriter();
		
		if(session.isNew())
		{
			List<String> booksBought = new ArrayList<String>();
			booksBought.add(bookToBuy);
			
			session.setAttribute("booksBought", booksBought);
			
			out.println("<h1> Welcome to our BookStore!! </h1>");
			out.println("<h2> You bought " + bookToBuy + "</h2>");
			out.println("<br/><br/><br/>");
			out.println("<a href='/bookstore/'>Go back to Main page</a>");
		}
		else
		{
			List<String> booksBought = (List<String>) session.getAttribute("booksBought");
			booksBought.add(bookToBuy);
			
			out.println("<h1> Welcome back!!");
			out.println("<h2> You bought these books so far </h2>");
			out.println("<ol>");

			for(String aBook : booksBought)
			{
				out.println("<li>" + aBook + "</li>");
			}
			out.println("</ol>");
			out.println("<br/><br/><br/>");
			out.println("<a href='/bookstore/'>Go back to Main page</a>");
		}
	}
}
