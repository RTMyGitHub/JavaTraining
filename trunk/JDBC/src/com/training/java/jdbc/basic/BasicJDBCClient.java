package com.training.java.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicJDBCClient {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet rs = null;
	    
	    try
        {
            //You do NOT have to load driver explicitly in JDK 1.6
	        Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "password");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from book");
            
            String author = null;
            while(rs.next())
            {
                author = rs.getString("author");
                System.out.println("author == " + author);
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(rs != null)
                {
                    rs.close();
                }
                
                if(stmt != null)
                {
                    stmt.close();
                }
                if(con != null && !con.isClosed())
                {
                    con.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
	}
}
