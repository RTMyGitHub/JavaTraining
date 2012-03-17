package com.training.java.springmvc3.domain;

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
		return dao.getAllStudents();
	}
}
