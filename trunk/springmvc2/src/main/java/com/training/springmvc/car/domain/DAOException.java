package com.training.springmvc.car.domain;

public class DAOException extends RuntimeException {

	public DAOException(String errorMessage) {
		super(errorMessage);
	}
	
	public DAOException(Throwable ex) {
		super(ex);
	}
}
