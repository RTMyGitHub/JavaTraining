package com.training.java.jstl.domain;

import java.util.List;

interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
