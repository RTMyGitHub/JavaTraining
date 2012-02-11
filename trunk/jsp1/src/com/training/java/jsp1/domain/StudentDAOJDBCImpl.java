package com.training.java.jsp1.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOJDBCImpl implements StudentDAO {

	private String driverClassName;
	private String jdbcURL;
	private String username;
	private String password;

	public StudentDAOJDBCImpl(String driverClassName, String jdbcURL,
			String username, String password) {
		this.driverClassName = driverClassName;
		this.jdbcURL = jdbcURL;
		this.username = username;
		this.password = password;
	}

	@Override
	public List<Student> getAllStudents() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from students");

			List<Student> students = new ArrayList<Student>();

			while (resultSet.next()) {
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

				students.add(student);
			}

			return students;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(e);
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				closeResources(statement, connection);
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	@Override
	public void create(Student student) {

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = getConnection();

			statement = connection
					.prepareStatement("insert into students values(?, ?, ?, ?, ?, ?, ?)");

			statement.setString(1, student.getFirstName());
			statement.setString(2, student.getLastName());
			statement.setString(3, student.getPhoneNumber());
			statement.setString(4, student.getEmail());
			statement.setInt(5, student.getAge());
			statement.setString(6, student.getCity());
			statement.setInt(7, student.getId());

			statement.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DAOException(ex);
		} finally {
			closeResources(statement, connection);
		}
	}

	private void closeResources(Statement statement, Connection connection) {
		try {
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private Connection getConnection() throws SQLException {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException ex) {
			throw new DAOException(ex);
		}
		return DriverManager.getConnection(jdbcURL, username, password);
	}

}
