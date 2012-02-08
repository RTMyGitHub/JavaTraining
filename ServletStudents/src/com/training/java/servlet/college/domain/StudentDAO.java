package com.training.java.servlet.college.domain;

import java.util.List;

public interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
