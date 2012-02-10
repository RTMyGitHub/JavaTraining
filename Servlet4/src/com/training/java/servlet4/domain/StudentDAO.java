package com.training.java.servlet4.domain;

import java.util.List;

public interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
