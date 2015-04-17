package com.javavenkat.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement statement = null;
		
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oms", "oms");
			statement = con.createStatement();
			
			StringBuilder sql = new StringBuilder();
			
			sql.append("insert into customer values (");
			sql.append("4,");
			sql.append("'Shovan',");
			sql.append("'SL',");
			sql.append("'321 Shovan Dr',");
			sql.append("'NYC',");
			sql.append("'NY',");
			sql.append("'88888')");
			
			System.out.println(sql.toString());
			
			int rowsInserted = statement.executeUpdate(sql.toString());
			
			System.out.println("rowsInserted = " + rowsInserted);
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
