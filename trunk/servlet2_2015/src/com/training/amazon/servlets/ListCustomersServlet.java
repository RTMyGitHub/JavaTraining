package com.training.amazon.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
			
			PrintWriter out = response.getWriter();
			
			out.write("<html>");
			
			out.write("<head>");
			out.write("<style>");
			out.write("table, td, th {border: 1px solid green;}");
			out.write("th {background-color: green;color: white;}");
			out.write("</style></head>");
			
			out.write("<body>");
			out.write("<table>");
			out.write("<tr>");
			out.write("<th>First Name</th>");
			out.write("<th>Last Name</th>");
			out.write("<th>Address</th>");
			out.write("<th>City</th>");
			out.write("<th>State</th>");
			out.write("<th>Zip</th>");
			out.write("<th>Delete</th>");
			out.write("</tr>");
			
			for(Customer customer : customers) 
			{
				out.write("<tr>");
				out.write("<td>" + customer.getFirstName() + "</td>");
				out.write("<td>" + customer.getLastName() + "</td>");
				out.write("<td>" + customer.getAddress() + "</td>");
				out.write("<td>" + customer.getCity() + "</td>");
				out.write("<td>" + customer.getState() + "</td>");
				out.write("<td>" + customer.getZipCode() + "</td>");
				out.write("<td><a href='/servlet2/delete?id=" + customer.getId() + "'>Click</a>");
				out.write("</tr>");
			}
			
			out.write("</table>");
			out.write("</body></html>");
		} catch (DAOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
