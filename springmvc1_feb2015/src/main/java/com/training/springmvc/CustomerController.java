package com.training.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@RequestMapping("/customer/add")
	public ModelAndView signupForm() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("AddCustomer");
		modelAndView.addObject("customer", new Customer());
		
		return modelAndView;
	}

	@RequestMapping(value = "/customer/add", method = RequestMethod.POST)
	public String saveCustomer(Customer customer) {
		System.out.println("First name = " + customer.getFirstName());
		System.out.println("Last name = " + customer.getLastName());
		System.out.println("city = " + customer.getCity());
		System.out.println("state = " + customer.getState());
		System.out.println("zipCode = " + customer.getZipCode());
		
		return "Success";
	}

}
