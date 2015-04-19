package com.javavenkat.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementInsertDemo {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement statement = null;
		
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oms", "oms");
			
			String sql = "insert into customer values (?,?,?,?,?,?,?)";
			
			statement = con.prepareStatement(sql);
			
			statement.setInt(1, 6);
			statement.setString(2, "Sekhar");
			statement.setString(3, "SekharLastName");
			statement.setString(4, "999 Sekhar Dr");
			statement.setString(5, "Plano");
			statement.setString(6, "TX");
			statement.setString(7, "54321");
			
			System.out.println(sql.toString());
			
			int rowsInserted = statement.executeUpdate();
			
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
