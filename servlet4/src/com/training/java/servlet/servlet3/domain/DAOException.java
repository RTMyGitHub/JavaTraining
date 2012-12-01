package com.training.java.servlet.servlet3.domain;


public class DAOException extends Exception {
	
	public DAOException(String errorMessage)
	{
		super(errorMessage);
	}
	
	public DAOException(Throwable cause)
	{
		super(cause);
	}

	public DAOException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
		
	}
}
