package com.training.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String emptyForm() {
		System.out.println("emptyForm called, so forwarding to Login page");
		return "Login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validate(@RequestParam String username,
			@RequestParam String password) {
		System.out.println("username = " + username);
		System.out.println("password = " + password);

		return "Success";
	}

}
