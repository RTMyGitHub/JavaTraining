package com.training.java.springmvc3.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.java.springmvc3.domain.Student;
import com.training.java.springmvc3.domain.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping
	public String getAllStudents(Model model)
	{
		List<Student> students = service.getAllStudents();
		model.addAttribute("students", students);
		
		return "/students/List";
	}
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String createStudentForm(Model model)
	{
		model.addAttribute(new Student());
		
		return "/students/Add";
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
			return "/students/Add";
		}
		else
		{
			try {
				service.addStudent(student);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return "/students/Acknowledgement";
		}
	}

}
