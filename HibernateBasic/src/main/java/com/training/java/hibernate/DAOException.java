package com.training.java.hibernate;

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
