package com.training.spring.two;

public class DAOException extends RuntimeException {

	public DAOException(String errorMessage) {
		super(errorMessage);
	}
	
	public DAOException(Throwable ex) {
		super(ex);
	}
}
