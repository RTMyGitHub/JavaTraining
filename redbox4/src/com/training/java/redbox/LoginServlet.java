package com.training.java.redbox;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.java.redbox.domain.Customer;
import com.training.java.redbox.domain.CustomerDAO;
import com.training.java.redbox.domain.CustomerDaoJdbcImpl;
import com.training.java.redbox.domain.DAOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Login.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Customer customer = null;
		
		CustomerDAO dao = new CustomerDaoJdbcImpl();
		
		try {
			
			customer = dao.findByUsernameAndPassword(username, password);
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		if (customer!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("customer", customer);
			
			RequestDispatcher rd = request.getRequestDispatcher("/");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("error", 1);
			doGet(request, response);
		}
	
	}

}
