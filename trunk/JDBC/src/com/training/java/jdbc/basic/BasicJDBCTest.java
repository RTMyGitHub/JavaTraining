package com.training.java.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class BasicJDBCTest {

	@Test
	public void testSelectStudents() throws ClassNotFoundException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from students");
			while (resultSet.next()) {
				String firstName = resultSet.getString("first_name");
				String lastName = resultSet.getString("last_name");
				String city = resultSet.getString("city");

				System.out.println("firstName = " + firstName);
				System.out.println("lastName = " + lastName);
				System.out.println("city = " + city);
			}
		} catch (SQLException e) {
			e.printStackTrace();
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

	@Test
	public void testInsert() throws ClassNotFoundException {

		Connection connection = null;
		Statement statement = null;

		try {
			connection = getConnection();
			statement = connection.createStatement();

			int rowsAffected = statement
					.executeUpdate("insert into students values('Sasi', 'RajKumar', '248-248-2488', 'sasi@gmail.com', 20, 'Troy', 6)");
			if (rowsAffected != 1) {
				throw new SQLException("Your record was not inserted");
			}

		} catch (SQLException e) {
			e.printStackTrace();
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

	private Connection getConnection() throws SQLException,
			ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/training",
				"root", "password");
	}
}
