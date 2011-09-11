package com.training.java.servlet.moviestore.domain;

public class MovieDAOException extends RuntimeException
{
	MovieDAOException(String errorMessage)
	{
		super(errorMessage);
	}

}
