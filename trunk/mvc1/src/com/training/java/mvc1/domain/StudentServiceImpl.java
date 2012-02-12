package com.training.java.mvc1.domain;

import java.util.List;

public class StudentServiceImpl implements StudentService {

	@Override
	public void addStudent(Student student) {

		StudentDAO dao = new StudentDAOJDBCImpl("com.mysql.jdbc.Driver",
				"jdbc:mysql://localhost/training", "root", "password");
		dao.create(student);

	}

	@Override
	public List<Student> getAllStudents() {
		StudentDAO dao = new StudentDAOJDBCImpl("com.mysql.jdbc.Driver",
				"jdbc:mysql://localhost/training", "root", "password");
		return dao.getAllStudents();
	}
}
