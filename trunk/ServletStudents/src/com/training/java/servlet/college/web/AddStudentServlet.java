package com.training.java.servlet.college.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.servlet.college.domain.Student;
import com.training.java.servlet.college.domain.StudentDAO;
import com.training.java.servlet.college.domain.StudentDAOJDBCImpl;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String city = request.getParameter("city");
		String id = request.getParameter("id");
		
		//do the validation here
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setPhoneNumber(phone);
		student.setEmail(email);
		student.setAge(Integer.parseInt(age));
		student.setCity(city);
		student.setId(Integer.parseInt(id));
		
		String driverClassName = getServletContext().getInitParameter("driverClassName");
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String username = getServletContext().getInitParameter("username");
		String password = getServletContext().getInitParameter("password");
		
		StudentDAO dao = new StudentDAOJDBCImpl(driverClassName, jdbcURL, username, password);
		dao.create(student);
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1> Your details have been saved successfully!");
	}

}
