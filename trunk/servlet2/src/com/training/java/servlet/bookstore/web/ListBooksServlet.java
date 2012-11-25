package com.training.java.servlet.bookstore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.jdbc.dao.two.Book;
import com.training.java.jdbc.dao.two.BookDAO;
import com.training.java.jdbc.dao.two.BookDAOJDBCImpl;
import com.training.java.jdbc.dao.two.DAOException;

/**
 * Servlet implementation class ListMoviesServlet
 */
public class ListBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		List<Book> books = Collections.emptyList();
		try {
			books = dao.getAllBooks();
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><BODY>");
		out.println("<TABLE border=\"1\" bordercolor=\"blue\">");
		out.println("<TR>");
		out.println("<TH>Title</TH>");
		out.println("<TH>Author</TH>");
		out.println("<TH>Pages</TH>");
		out.println("<TH>Pub date.</TH>");
		out.println("</TR>");
		
		for(Book aBook : books)
		{
			out.println("<TR>");
			out.println("<TD>" + aBook.getTitle() + "</TD>");
			out.println("<TD>" + aBook.getAuthor() + "</TD>");
			out.println("<TD>" + aBook.getPages() + "</TD>");
			out.println("<TD>" + aBook.getPublisherDate() + "</TD>");
			out.println("</TR>");
		}
		
		out.println("</TABLE></BODY></HTML>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost called on ListBook");
		
		
	}

}
