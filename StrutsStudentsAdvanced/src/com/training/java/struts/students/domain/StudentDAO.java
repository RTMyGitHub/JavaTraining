package com.training.java.struts.students.domain;

import java.util.List;

interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
