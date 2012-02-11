package com.training.java.jsp1.domain;

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
