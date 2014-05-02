package com.training.java.spring.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@RequestMapping(value = "/customer/signup.do", method = RequestMethod.GET)
	public ModelAndView getEmptyForm() {
		ModelAndView modelAndView = new ModelAndView("SignupForm");

		Customer customer = new Customer();

		customer.setFirstName("Please enter first name here");
		customer.setLastName("Please enter last name here");

		modelAndView.addObject("customer", customer);

		return modelAndView;
	}

	@RequestMapping(value = "/customer/signup.do", method = RequestMethod.POST)
	public String saveForm(@Valid Customer customer, BindingResult result) {
		
		if (result.hasErrors()) {
			
			System.out.println("has errors");
			
			return "SignupForm";
		} else {
			System.out.println(customer);
			return "Acknowledgement";
		}
		
	}

}
