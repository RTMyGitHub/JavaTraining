package com.sonicvision.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainMenuController {

	@RequestMapping({ "/", "/home" })
	public String homePage() {
		return "Home";
	}

	@RequestMapping("/about")
	public String aboutPage() {
		return "About";
	}

	@RequestMapping("/solutions")
	public String solutionsPage() {
		return "Solutions";
	}

	@RequestMapping("/services")
	public String servicesPage() {
		return "Services";
	}

	@RequestMapping("/careers")
	public String careersPage() {
		return "Careers";
	}

	@RequestMapping("/contact")
	public String contactPage() {
		return "Contact";
	}
}
