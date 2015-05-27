package com.training.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("Hey, I am in sayHello of HelloController");
		System.out.println("Calling service and get the data");
		
		return "HelloWorld";
	}

}
