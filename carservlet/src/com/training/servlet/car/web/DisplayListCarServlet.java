package com.training.servlet.car.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.servlet.car.domain.Car;

/**
 * Servlet implementation class DisplayListCarServlet
 */
public class DisplayListCarServlet extends HttpServlet {
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Car> cars = (List<Car>) request.getAttribute("carsToDisplay");
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><BODY>");
		out.println("<TABLE border='4' bordercolor='red'>");
		out.println("<TR>");
		out.println("<TH>Make</TH>");
		out.println("<TH>Model</TH>");
		out.println("<TH>Year</TH>");
		out.println("<TH>Price</TH>");
		out.println("</TR>");
		
		for(Car aCar : cars)
		{
			out.println("<TR>");
			out.println("<TD>" + aCar.getMake() + "</TD>");
			out.println("<TD>" + aCar.getModel() + "</TD>");
			out.println("<TD>" + aCar.getYear() + "</TD>");
			out.println("<TD>" + aCar.getPrice() + "</TD>");
			out.println("</TR>");
		}
		
		out.println("</TABLE>");
		out.println("</BODY></HTML>");
	}

}
