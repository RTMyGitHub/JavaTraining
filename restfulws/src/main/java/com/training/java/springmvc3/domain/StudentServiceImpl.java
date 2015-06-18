package com.training.java.springmvc3.domain;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDAO dao;

	@Override
	public void addStudent(Student student) {
		dao.create(student);
	}

	@Override
	public List<Student> getAllStudents() {
		Student student1 = new Student();
		
		student1.setFirstName("Venkat");
		student1.setLastName("Hari");
		
		return Arrays.asList(student1);
		
		//return dao.getAllStudents();
	}
	
}
