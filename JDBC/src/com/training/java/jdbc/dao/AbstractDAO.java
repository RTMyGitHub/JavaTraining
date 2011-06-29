package com.training.java.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbstractDAO {
	public Connection getConnection(String dburl, String dbusername, String dbpassword) throws ClassNotFoundException, SQLException {
		String password = "";
		if (dbpassword == null || "".equals(dbpassword)) {
			password = "";
		}
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl, dbusername, password);
		return con;
	}
}
