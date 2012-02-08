package com.training.java.servlet.college.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet.college.domain.Student;
import com.training.java.servlet.college.domain.StudentDAO;
import com.training.java.servlet.college.domain.StudentDAOJDBCImpl;

/**
 * Servlet implementation class ListStudentsServlet
 */
public class ListStudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudentsServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String maxResultsStr = getServletConfig().getInitParameter("maxResults");
		int maxResults = Integer.parseInt(maxResultsStr);
		
		String driverClassName = getServletContext().getInitParameter("driverClassName");
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String username = getServletContext().getInitParameter("username");
		String password = getServletContext().getInitParameter("password");
		
		StudentDAO dao = new StudentDAOJDBCImpl(driverClassName, jdbcURL, username, password);
		List<Student> students = dao.getAllStudents();
		
		PrintWriter out = response.getWriter();
		
		out.print("<HTML>");
		out.print("<BODY>");
		out.print("<TABLE border=\"1\" bordercolor=\"blue\">");
		out.print("<TR>");
		out.print("<TH>First Name</TH>");
		out.print("<TH>Last Name</TH>");
		out.print("<TH>Phone Number</TH>");
		out.print("</TR>");

		for(int i=0; i<maxResults; i++)
		{
			Student current = students.get(i);
			
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
		// TODO Auto-generated method stub
	}

}
