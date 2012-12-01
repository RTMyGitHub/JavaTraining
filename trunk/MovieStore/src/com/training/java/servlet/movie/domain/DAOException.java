package com.training.java.servlet.movie.domain;

public class DAOException extends RuntimeException {

	public DAOException(String mess)
	{
		super(mess);
		
	}
	public DAOException(Throwable e)
	{
		super(e);
	}
}
