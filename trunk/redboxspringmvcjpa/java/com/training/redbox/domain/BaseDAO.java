package com.training.redbox.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDAO {

	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String username = "redbox";
	private static final String password = "redbox";
	
	// getConnection method

		protected  Connection getConnection() throws DAOException {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				return DriverManager.getConnection(jdbcURL, username, password);

			} catch (ClassNotFoundException ex) {
				throw new DAOException(ex, "Class Not Found");
			} catch (SQLException ex) {
				throw new DAOException(ex);
			}

		}

		/**
		 * Close all resources:
		 * 
		 * Close connection Close statement Close resultSet
		 */
		protected  void closeResources(Connection connection, Statement statement,
				ResultSet resultSet) {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}

