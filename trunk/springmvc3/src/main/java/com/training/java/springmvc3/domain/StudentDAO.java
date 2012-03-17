package com.training.java.springmvc3.domain;

import java.util.List;

interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
