package com.training.java.jsp.actions.domain;

import java.util.List;

interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
