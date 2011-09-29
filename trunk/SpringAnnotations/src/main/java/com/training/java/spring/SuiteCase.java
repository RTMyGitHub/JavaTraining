package com.training.java.spring;

import org.springframework.stereotype.Component;

@Component
public class SuiteCase implements Luggage
{

	public String getCompanyName()
	{
		return "VIP";
	}

}
