package com.training.java.servlet.web;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.java.servlet.domain.Book;
import com.training.java.servlet.domain.BookDAO;
import com.training.java.servlet.domain.BookDAOJDBCImpl;
import com.training.java.servlet.domain.DAOException;

/**
 * Servlet implementation class ListBookServlet
 */
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListBookServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");

		List<Book> books = null;

		try {
			books = dao.getAllBooks();
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("BooksToDisplay", books);
		
		
		
		Book book = new Book(10, "Gandhi CEO",  "Suneetha", "9876", 221, new Date());
		
		HttpSession session = request.getSession();
		session.setAttribute("book", book);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/DisplayBooks.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
