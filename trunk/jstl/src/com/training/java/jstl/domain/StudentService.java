package com.training.java.jstl.domain;

import java.util.List;

public interface StudentService {
	
	List<Student> getAllStudents();
	void addStudent(Student student);

}
