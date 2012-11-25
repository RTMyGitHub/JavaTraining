package com.training.java.servlet.bookstore.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.jdbc.dao.two.Book;
import com.training.java.jdbc.dao.two.BookDAO;
import com.training.java.jdbc.dao.two.BookDAOJDBCImpl;
import com.training.java.jdbc.dao.two.DAOException;

/**
 * Servlet implementation class AddBookServlet
 */
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String isbn = request.getParameter("isbn");
		String pubDate = request.getParameter("pubDate");
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String pages = request.getParameter("pages");
		
		DateFormat format = new SimpleDateFormat("mmDDyyyy");
		Date publishedDate = null;
		try {
			publishedDate = format.parse(pubDate);
		} catch (ParseException ex) {
			ex.printStackTrace();
		}

		Book book = new Book(0, title, author, isbn, Integer.parseInt(pages), publishedDate);
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		try {
			dao.addBook(book);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		out.println("<h3>Your details have been successfuly saved!!!</h3>");
	}

}
