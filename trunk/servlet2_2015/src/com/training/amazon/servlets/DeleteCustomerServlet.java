package com.training.amazon.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.amazon.dao.CustomerDAO;
import com.training.amazon.dao.CustomerDAOJDBCImpl;
import com.training.amazon.dao.DAOException;

/**
 * Servlet implementation class DeleteCustomerServlet
 */
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		
		CustomerDAO dao = new CustomerDAOJDBCImpl();
		try {
			dao.deleteCustomer(id);
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
