package com.training.java.mvc1.domain;

import java.util.List;

public interface StudentService {
	
	List<Student> getAllStudents();
	void addStudent(Student student);

}
