package com.training.java.struts.students.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.struts.students.domain.Student;
import com.training.java.struts.students.domain.StudentService;
import com.training.java.struts.students.domain.StudentServiceImpl;

public class ListStudentAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		StudentService service = new StudentServiceImpl();
		List<Student> students = service.getAllStudents();
		
		request.setAttribute("students", students);
		
		return mapping.findForward("list");
	}

}
