package com.training.java.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicJDBCClient {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "password");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from book");
		
		String author = null;
		while(rs.next())
		{
			author = rs.getString("author");
			System.out.println("author == " + author);
		}
		
		//TODO put this in finally block
		con.close();
	}

}
