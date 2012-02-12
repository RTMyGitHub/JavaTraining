package com.training.java.mvc1.domain;

import java.util.List;

interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
