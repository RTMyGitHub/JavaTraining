package com.training.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController
{
	@RequestMapping({"/hello", "/hi"})
	public String sayHello()
	{
		//TODO should call service class here
		return "HelloWorld";
	}
	
}
