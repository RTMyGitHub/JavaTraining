package com.training.java.jdbc.teamdao.television;

public class DAOException extends RuntimeException {
	
	public DAOException(String errorMessage)
	{
		super(errorMessage);
	}
	public DAOException(Throwable cause)
	{
		super(cause);
	}

}
