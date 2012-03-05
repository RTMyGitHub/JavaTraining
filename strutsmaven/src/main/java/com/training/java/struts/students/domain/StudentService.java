package com.training.java.struts.students.domain;

import java.util.List;

public interface StudentService {
	
	List<Student> getAllStudents();
	void addStudent(Student student);

}
