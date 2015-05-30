package com.eshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.Customer;
import com.eshop.service.CustomerService;

@Controller
public class SignUpController {
	
	@Autowired
	private CustomerService service;

	@RequestMapping("/signup")
	public ModelAndView emptyForm() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("SignUp");
		modelAndView.addObject("customer", new Customer());
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/signup", method=RequestMethod.POST)
	public String signup(Customer customer) {
		service.add(customer);
		return "Login";
	}
}
