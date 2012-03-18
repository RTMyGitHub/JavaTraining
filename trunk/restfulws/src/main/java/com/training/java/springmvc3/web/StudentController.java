package com.training.java.springmvc3.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.java.springmvc3.domain.Student;
import com.training.java.springmvc3.domain.StudentList;
import com.training.java.springmvc3.domain.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping
	public ModelAndView getAllStudents()
	{
		StudentList sl = new StudentList();
		sl.setStudents(service.getAllStudents());
		
		return new ModelAndView("students", "students", sl);
	}
	
	@RequestMapping(value="/{studentId}")
	public ModelAndView getStudentById(@PathVariable int studentId)
	{
		Student s = new Student();
		s.setFirstName("Venkat");
		
		return new ModelAndView("student", "student", s);
	}
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String createStudentForm(Model model)
	{
		model.addAttribute(new Student());
		
		return "Add";
	}
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public String addStudent(@Valid Student student, BindingResult bindingResult)
	{
		System.out.println("Errors = " + bindingResult.hasErrors());
		List<FieldError> errors = bindingResult.getFieldErrors();
		for(FieldError error : errors)
		{
			System.out.println("error = " + error.getDefaultMessage());
		}
		
		if(bindingResult.hasErrors())
		{
			return "Add";
		}
		else
		{
			try {
				service.addStudent(student);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return "Acknowledgement";
		}
	}

}
