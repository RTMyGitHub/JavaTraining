package com.training.java.jsp.actions.domain;

public class DAOException extends RuntimeException {
	
	public DAOException(Throwable ex)
	{
		super(ex);
	}
	
	public DAOException(String errorMessage, Throwable ex)
	{
		super(errorMessage, ex);
	}
}
