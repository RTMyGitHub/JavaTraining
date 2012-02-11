package com.training.java.jsp1.domain;

import java.util.List;

public interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
