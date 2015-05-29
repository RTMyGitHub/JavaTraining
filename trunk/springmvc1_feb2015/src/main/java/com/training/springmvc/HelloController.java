package com.training.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public String sayHello(@RequestParam("name") String name, @RequestParam("city") String city) {
		System.out.println("city = " + city);
		
		System.out.println("Hey, I am in sayHello of HelloController");
		System.out.println("Calling service and get the data");
		
		return "HelloWorld";
	}
}
	
