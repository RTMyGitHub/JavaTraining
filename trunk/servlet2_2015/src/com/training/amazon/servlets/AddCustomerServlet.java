package com.training.amazon.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.amazon.dao.Customer;
import com.training.amazon.dao.CustomerDAO;
import com.training.amazon.dao.CustomerDAOJDBCImpl;
import com.training.amazon.dao.DAOException;

public class AddCustomerServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("I am in doGet");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("I am in doPost");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zip = request.getParameter("zip");
		
		CustomerDAO dao = new CustomerDAOJDBCImpl();
		
		Customer customer = new Customer(0, firstName, lastName, address, city, state, zip);
		
		try {
			dao.createCustomer(customer);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
		System.out.println("first name = " + firstName);
		System.out.println("last name = " + lastName);
		System.out.println("city = " + city);
		System.out.println("zip = " + zip);
	}

}
