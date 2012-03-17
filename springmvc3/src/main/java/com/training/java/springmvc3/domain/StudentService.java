package com.training.java.springmvc3.domain;

import java.util.List;

public interface StudentService {
	
	List<Student> getAllStudents();
	void addStudent(Student student);

}
