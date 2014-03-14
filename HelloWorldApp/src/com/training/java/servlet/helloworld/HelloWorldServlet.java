package com.training.java.servlet.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doGet metod has been called");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String city = request.getParameter("city");
		
		System.out.println("First name = " + firstName);
		System.out.println("lastName = " + lastName);
		System.out.println("city = " + city);
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<h1>Hello " + firstName + " " + lastName + "</h1>");
		out.println("</BODY>");
		out.println("</HTML>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("doPost metod has been called");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String city = request.getParameter("city");
		
		System.out.println("First name = " + firstName);
		System.out.println("lastName = " + lastName);
		System.out.println("city = " + city);
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<h1>Hello " + firstName + " " + lastName + "</h1>");
		out.println("</BODY>");
		out.println("</HTML>");
	
	
	}

}
