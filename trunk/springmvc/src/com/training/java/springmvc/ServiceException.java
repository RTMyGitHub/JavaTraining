package com.training.java.springmvc;

public class ServiceException extends Exception {

	public ServiceException(Exception ex) {
		super(ex);
	}

}
