package com.training.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		Enumeration<String> headers = req.getHeaderNames();
		while(headers.hasMoreElements())
		{
			String headerName = headers.nextElement();
			String headerValue = req.getHeader(headerName);
			
			System.out.println(headerName + " = " + headerValue);
		}
		
		String firstName = req.getParameter("fn");
		String lastName = req.getParameter("ln");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<H1> Welcome to my dynamic App " + lastName + ", " + firstName);
		out.print("<H2> Time on my end is " + new Date());
		out.print("</BODY>");
		out.print("</HTML>");
	}

}
