package com.training.redbox.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("In home controller");
		return "redirect:/movies/list";
	}

}
