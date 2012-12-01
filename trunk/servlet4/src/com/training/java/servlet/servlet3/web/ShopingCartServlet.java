package com.training.java.servlet.servlet3.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.java.servlet.servlet3.domain.Book;

/**
 * Servlet implementation class ShopingCartServlet
 */
public class ShopingCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopingCartServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		List<Book> booksPurchased = (List<Book>) session.getAttribute("PurchasedBooks");
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><BODY>");
		out.println("<h2>These are the books in your cart so far </h2>");
		out.println("<ul>");
		
		for(Book aBook : booksPurchased)
		{
			out.println("<li>" + aBook.getTitle() + "</li>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
