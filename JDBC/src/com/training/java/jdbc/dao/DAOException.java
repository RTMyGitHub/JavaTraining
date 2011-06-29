package com.training.java.jdbc.dao;

public class DAOException extends Exception {
	
	public DAOException(Exception cause)
	{
		super(cause);
	}
	
	public DAOException(String message)
	{
		super(message);
	}

}
