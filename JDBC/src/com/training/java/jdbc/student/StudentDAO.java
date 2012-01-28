package com.training.java.jdbc.student;

import java.util.List;

public interface StudentDAO {
	
	List<Student> getAllStudents();
	void create(Student student);

}
