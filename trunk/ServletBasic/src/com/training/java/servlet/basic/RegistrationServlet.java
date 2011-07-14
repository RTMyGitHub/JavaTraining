package com.training.java.servlet.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String firstName = request.getParameter("fn");
	String lastName = request.getParameter("ln");
	String ssn = request.getParameter("ssn");
	
	PrintWriter out = response.getWriter();
	
	out.println("<HTML><BODY>");
	out.println("<H2>This is the response from doGet() </H2><BR/>");
	out.println("Thanks for your information, we will store them in our database..This is what we have got<BR/>");
	out.println("First Name = " + firstName + "<BR/>");
	out.println("Last Name = " + lastName + "<BR/>");
	out.println("SSN = " + ssn);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fn");
		String lastName = request.getParameter("ln");
		String ssn = request.getParameter("ssn");
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><BODY>");
		out.println("<H2>This is the response from doPost() </H2><BR/>");
		out.println("Thanks for your information, we will store them in our database..This is what we have got<BR/>");
		out.println("First Name = " + firstName + "<BR/>");
		out.println("Last Name = " + lastName + "<BR/>");
		out.println("SSN = " + ssn);
	}

}
