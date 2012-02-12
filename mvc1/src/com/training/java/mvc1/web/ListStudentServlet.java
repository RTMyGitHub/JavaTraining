package com.training.java.mvc1.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.java.mvc1.domain.Student;
import com.training.java.mvc1.domain.StudentService;
import com.training.java.mvc1.domain.StudentServiceImpl;

/**
 * Servlet implementation class ListStudentServlet
 */
public class ListStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		StudentService service = new StudentServiceImpl();
		List<Student> students = service.getAllStudents();
		
		//Put Model data in request as attribute to make this data available to view(JSP)
		req.setAttribute("students", students);
		
		//Ask view (JSP) to render the fancy dynamic HTML
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/list.jsp");
		dispatcher.forward(req, res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
