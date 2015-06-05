package com.eshop.web;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String emptyForm() {
		return "Login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validate(@RequestParam String username,
			@RequestParam String password) {
		
		if ("test".equals(username) && "test".equals(password)) {
			return "OrderSummary";
		} else {
			return "Login";
		}
	}

}
