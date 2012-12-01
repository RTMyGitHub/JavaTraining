package com.training.java.servlet.servlet3.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet.servlet3.domain.Book;

/**
 * Servlet implementation class DisplayBooksServlet
 */
public class DisplayBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayBooksServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Book> books = (List<Book>) request.getAttribute("BOOKS_TO_DISPLAY");
		int maxBooksDisplayed = (Integer) request.getAttribute("MAX_BOOKS_DISPLAYED");
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><BODY>");
		out.println("<TABLE border=\"1\" bordercolor=\"blue\">");
		out.println("<TR>");
		out.println("<TH>Title</TH>");
		out.println("<TH>Author</TH>");
		out.println("<TH>Pages</TH>");
		out.println("<TH>Pub date.</TH>");
		out.println("<TH>Buy Link</TH>");
		out.println("</TR>");
		
		if(maxBooksDisplayed > books.size())
		{
			maxBooksDisplayed = books.size();
		}
		
		
		for(int i=0; i<maxBooksDisplayed; i++)
		{
			Book aBook = books.get(i);
			
			out.println("<TR>");
			out.println("<TD>" + aBook.getTitle() + "</TD>");
			out.println("<TD>" + aBook.getAuthor() + "</TD>");
			out.println("<TD>" + aBook.getPages() + "</TD>");
			out.println("<TD>" + aBook.getPublisherDate() + "</TD>");
			out.println("<TD> <a href='/bookstore/buy?id=" + aBook.getId() + "'> Buy </a> </TD>");
			
			out.println("</TR>");
		}
		
		out.println("</TABLE></BODY></HTML>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
