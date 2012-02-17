package com.training.java.jstl.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.java.jstl.domain.Student;
import com.training.java.jstl.domain.StudentService;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student student = new Student();
		
		student.setFirstName("Sasi");
		student.setLastName("Raj Kumar");
		student.setCity("Troy");
		
		request.setAttribute("student", student);
		
		HttpSession session = request.getSession();
		session.setAttribute("street", "Corporate Dr");
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(student);
		
		Student student2 = new Student();
		student2.setFirstName("Ronnie");
		student2.setLastName("Mac");
		student2.setCity("Rochester");
		
		students.add(student2);
		
		request.setAttribute("students", students);
		request.setAttribute("size", "3");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/student.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
