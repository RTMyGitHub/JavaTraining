package com.training.java.servlet4.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet4.domain.Student;

/**
 * Servlet implementation class ListStudentDisplayServlet
 */
public class ListStudentDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudentDisplayServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> students = (List<Student>) request.getAttribute("students");
		
		PrintWriter out = response.getWriter();
		
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<TABLE border=\"1\" bordercolor=\"blue\">");
		out.print("<TR>");
		out.print("<TH>First Name</TH>");
		out.print("<TH>Last Name</TH>");
		out.print("<TH>Phone Number</TH>");
		out.print("</TR>");

		for(Student current : students)
		{
			out.print("<TR>");
			out.print("<TD>" + current.getFirstName() + "</TD>");
			out.print("<TD>" + current.getLastName() + "</TD>");
			out.print("<TD>" + current.getPhoneNumber() + "</TD>");
			out.print("</TR>");
		}
		
		out.print("</TABLE>");
		out.print("</BODY>");
		out.print("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
