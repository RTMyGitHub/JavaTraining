package com.javavenkat.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement statement = null;
		
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oms", "oms");
			statement = con.createStatement();
			
			int rowsUpdated = statement.executeUpdate("update customer set first_name = 'Show' where customer_id = 4");
			
			System.out.println("rowsUpdated = " + rowsUpdated);
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			try
			{
				statement.close();
				con.close();
			} catch (SQLException ex){
				
			}
		}
	

	}

}
