package com.javavenkat.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDeleteDemo {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement statement = null;
		
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oms", "oms");
			statement = con.prepareStatement("delete from customer where customer_id = ?");
			
			statement.setInt(1, 3);
			
			int rowsDeleted = statement.executeUpdate();
			
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
