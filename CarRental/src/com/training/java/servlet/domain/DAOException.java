package com.training.java.servlet.domain;

import java.sql.SQLException;

public class DAOException extends Exception {

	public DAOException(Exception ex, String errorMessage) {
		super(errorMessage, ex);
	}

	public DAOException(String errorMessage) {
		super(errorMessage);
	}

	public DAOException(SQLException ex) {
		super(ex);
	}

}
