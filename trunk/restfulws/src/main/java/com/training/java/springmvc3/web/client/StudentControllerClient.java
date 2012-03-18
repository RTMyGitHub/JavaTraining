package com.training.java.springmvc3.web.client;

import org.springframework.web.client.RestTemplate;

public class StudentControllerClient
{
	public static void main(String[] args)
	{
		 RestTemplate template = new RestTemplate();
		String response = template.getForObject("http://localhost:8080/restfulws/students", String.class);
		System.out.println("Response = " + response);
	}
}
