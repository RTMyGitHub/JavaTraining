package com.training.java.springmvc3.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		String firstName = resultSet.getString("first_name");
		String lastName = resultSet.getString("last_name");
		String city = resultSet.getString("city");
		int id = resultSet.getInt("id");
		int age = resultSet.getInt("age");
		String phoneNumber = resultSet.getString("phone_number");
		String email = resultSet.getString("email");

		Student student = new Student();
		student.setAge(age);
		student.setCity(city);
		student.setEmail(email);
		student.setFirstName(firstName);
		student.setId(id);
		student.setLastName(lastName);
		student.setPhoneNumber(phoneNumber);
		
		return student;
	}

}
