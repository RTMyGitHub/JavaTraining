package com.training.java.jdbc.movie;

public class MovieDAOException extends RuntimeException
{
	MovieDAOException(String errorMessage)
	{
		super(errorMessage);
	}

}
