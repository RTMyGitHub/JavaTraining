package com.training.java.moviestore.domain;

public class MovieDAOException extends RuntimeException
{
	MovieDAOException(String errorMessage)
	{
		super(errorMessage);
	}

}
