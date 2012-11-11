package com.training.java.jdbc.basic.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from book");
			
			while(resultSet.next())
			{
				int bookId = resultSet.getInt("book_id");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				int numberPages = resultSet.getInt("number_of_pages");
				String isbn = resultSet.getString("isbn");
				
				System.out.println("bookId = " + bookId);
				System.out.println("title = " + title);
				System.out.println("author = " + author);
				System.out.println("numberPages = " + numberPages);
				System.out.println("isbn = " + isbn);
				
				System.out.println("***************************");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			closeResources(connection, statement, resultSet);
		}
	}

	private static void closeResources(Connection connection,
			Statement statement, ResultSet resultSet) {
		if(resultSet != null)
		{
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(statement != null)
		{
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(connection != null)
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
