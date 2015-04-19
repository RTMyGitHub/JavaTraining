package com.javavenkat.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUpdateDemo {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement statement = null;
		
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oms", "oms");
			
			String sql = "update 	customer " +
			             "set 	 	first_name = ?, " +
			             "			last_name = ? " +
			             "where 	customer_id = ?";	
			
			statement = con.prepareStatement(sql);
			
			statement.setString(1, "RealFirstName");
			statement.setString(2, "SekharName");
			statement.setInt(3, 6);
			
			int rowsUpdated = statement.executeUpdate();
			
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
