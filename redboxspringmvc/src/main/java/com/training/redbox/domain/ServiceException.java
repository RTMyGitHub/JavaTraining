package com.training.redbox.domain;

public class ServiceException extends Exception {

	public ServiceException(Exception ex) {
		super(ex);
	}

}
