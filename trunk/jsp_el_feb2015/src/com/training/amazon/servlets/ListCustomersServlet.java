package com.training.amazon.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.amazon.dao.Customer;
import com.training.amazon.dao.CustomerDAO;
import com.training.amazon.dao.CustomerDAOJDBCImpl;
import com.training.amazon.dao.DAOException;

/**
 * Servlet implementation class ListCustomersServlet
 */
public class ListCustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerDAO dao = new CustomerDAOJDBCImpl();
		
		try {
			List<Customer> customers = dao.getAllCustomers();
			
			Customer fc = customers.get(0);
			
			request.setAttribute("firstCustomer", fc);
			request.setAttribute("customerList", customers);
			
			//forward to JSP
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/list_customers.jsp");
			dispatcher.forward(request, response);
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
