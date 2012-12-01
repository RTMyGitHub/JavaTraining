package com.training.java.servlet.servlet3.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.java.servlet.servlet3.domain.Book;
import com.training.java.servlet.servlet3.domain.BookDAO;
import com.training.java.servlet.servlet3.domain.BookDAOJDBCImpl;
import com.training.java.servlet.servlet3.domain.DAOException;

/**
 * Servlet implementation class BuyBookServlet
 */
public class BuyBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyBookServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String dbUsername = getServletContext().getInitParameter("dbUsername");
		String dbPassword = getServletContext().getInitParameter("dbPassword");
		
		BookDAO dao = new BookDAOJDBCImpl(jdbcURL, dbUsername, dbPassword);
		Book bookBought = null;
		
		try {
			bookBought = dao.findByPrimaryKey(id);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		HttpSession session = request.getSession();
		
		List<Book> booksBought = null;
		if(session.isNew())
		{
			booksBought = new ArrayList<>();
			booksBought.add(bookBought);
			
			session.setAttribute("PurchasedBooks", booksBought);
		}
		else
		{
			booksBought = (List<Book>) session.getAttribute("PurchasedBooks");
			booksBought.add(bookBought);
		}
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><BODY>");
		out.println("<h3>Your book has been added to the <a href='/bookstore/cart'>Cart(" + booksBought.size() + ")</a></h3>");
		
		out.println("<h4>Please click <a href='/bookstore/list'>here</a> to go to the list of books </h4>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
