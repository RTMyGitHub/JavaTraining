package com.training.java.struts.domain;

public class ServiceException extends Exception {
	
	public ServiceException(Throwable ex)
	{
		super(ex);
	}
	
	public ServiceException(String errorMessage)
	{
		super(errorMessage);
	}

}
