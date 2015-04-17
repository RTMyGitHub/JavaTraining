package com.javavenkat.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oms", "oms");
			statement = con.createStatement();
			
			rs = statement.executeQuery("select * from customer");
			
			while(rs.next())
			{
				int custId = rs.getInt("customer_id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String address = rs.getString("address");
				String city = rs.getString("city");
				String state = rs.getString("state");
				String zip = rs.getString("zip");
				
				System.out.println("First name = " + firstName);
				System.out.println("Address = " + address);
				System.out.println("Zip = " + zip);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
		} finally {
			try
			{
				rs.close();
				statement.close();
				con.close();
			} catch (SQLException ex){
				
			}
		}
		
		//establish the connection
		//get handle to Statement
		//execute the SQL statement/query
									

	}

}
