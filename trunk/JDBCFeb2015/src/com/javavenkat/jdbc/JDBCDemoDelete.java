package com.javavenkat.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemoDelete {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement statement = null;
		
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oms", "oms");
			statement = con.createStatement();
			
			int rowsDeleted = statement.executeUpdate("delete from customer where customer_id = 4");
			
			System.out.println("rowsDeleted = " + rowsDeleted);
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
