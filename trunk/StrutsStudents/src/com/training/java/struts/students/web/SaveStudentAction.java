package com.training.java.struts.students.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.training.java.struts.students.domain.Student;
import com.training.java.struts.students.domain.StudentService;
import com.training.java.struts.students.domain.StudentServiceImpl;

public class SaveStudentAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
			StudentForm studentForm = (StudentForm) form;
		
			System.out.println("first name = " + studentForm.getFirstName());
			System.out.println("last name = " + studentForm.getLastName());
			System.out.println("Age = " + studentForm.getAge());
			
			Student student = new Student();
			
			student.setAge(studentForm.getAge());
			student.setFirstName(studentForm.getFirstName());
			student.setLastName(studentForm.getLastName());
			student.setId(studentForm.getId());
			student.setEmail(studentForm.getEmail());
			student.setCity(studentForm.getCity());
			student.setPhoneNumber(studentForm.getPhone());
			
			StudentService service = new StudentServiceImpl();
			service.addStudent(student);
			
			return mapping.findForward("acknowledgement");
	}
}
