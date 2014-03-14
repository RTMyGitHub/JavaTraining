package com.training.java.servlet.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet.domain.Car;
import com.training.java.servlet.domain.CarDAO;
import com.training.java.servlet.domain.CarDAOJDBCImpl;
import com.training.java.servlet.domain.DAOException;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Call DAO and get the List<Car> objects
		
		CarDAO dao = new CarDAOJDBCImpl();
		
		try {
			List<Car> cars = dao.getAllCars();
			
			PrintWriter out = response.getWriter();
			
			out.println("<table border=\"1\">");
			out.println("<tr>");
			out.println("<th>VIN Number</th>");
			out.println("<th>Make</th>");
			out.println("<th>Model</th>");
			out.println("<th>Year</th>");
			out.println("<th>Price</th>");
			out.println("</tr>");
			
			for(Car aCar : cars)
			{
				out.println("<tr>");
				out.println("<td>" + aCar.getVinNumber() + "</td>");
				out.println("<td>" + aCar.getMake() + "</td>");
				out.println("<td>" + aCar.getModel() + "</td>");
				out.println("<td>" + aCar.getYear() + "</td>");
				out.println("<td>" + aCar.getPrice() + "</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
	}

}
