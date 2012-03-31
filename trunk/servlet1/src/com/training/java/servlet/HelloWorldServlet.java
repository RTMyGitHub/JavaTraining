package com.training.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		out.write("<HTML><BODY>");
		out.write("<h2> Welcome " + lastName + " , " + firstName + "</h2>");
		out.write("<h4> Current time here on server is " + new Date() + "</h4>");
		out.write("</BODY></HTML>");
	}

}
