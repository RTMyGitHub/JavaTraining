package com.training.java.servlet.servlet3.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.time.DateUtils;

import com.training.java.servlet.servlet3.domain.Book;
import com.training.java.servlet.servlet3.domain.BookDAO;
import com.training.java.servlet.servlet3.domain.BookDAOJDBCImpl;
import com.training.java.servlet.servlet3.domain.DAOException;

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
		String publishedDateStr = request.getParameter("pubDate");
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String pages = request.getParameter("pages");
		
		String[] formats = {"mmDDyyyy"};
		
		Date publishedDate = null;
		try {
			publishedDate = DateUtils.parseDate(publishedDateStr, formats);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		Book book = new Book(0, title, author, isbn, Integer.parseInt(pages), publishedDate);
		
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String dbUsername = getServletContext().getInitParameter("dbUsername");
		String dbPassword = getServletContext().getInitParameter("dbPassword");
		
		BookDAO dao = new BookDAOJDBCImpl(jdbcURL, dbUsername, dbPassword);
		try {
			dao.addBook(book);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("/servlet3/list");
		
	}

}
