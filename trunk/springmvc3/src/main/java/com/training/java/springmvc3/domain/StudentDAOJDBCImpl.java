package com.training.java.springmvc3.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
class StudentDAOJDBCImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> getAllStudents() {
		return jdbcTemplate.query("select * from students",
				new StudentRowMapper());
	}

	@Override
	public void create(Student student) {

		jdbcTemplate.update("insert into students values(?, ?, ?, ?, ?, ?, ?)",
				student.getFirstName(), student.getLastName(),
				student.getPhoneNumber(), student.getEmail(), student.getAge(),
				student.getCity(), student.getId());

	}
}
