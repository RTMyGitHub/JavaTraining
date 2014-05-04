package com.training.redbox.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.redbox.domain.Customer;
import com.training.redbox.domain.CustomerService;
import com.training.redbox.domain.ServiceException;

@Controller
public class SignupController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView getEmptyForm() {
		ModelAndView modelAndView = new ModelAndView("SignupForm");

		Customer customer = new Customer();

		modelAndView.addObject("customer", customer);

		return modelAndView;
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String saveForm(@Valid Customer customer, BindingResult result) {

		if (result.hasErrors()) {

			System.out.println("has errors");

			return "SignupForm";
		} else {
			System.out.println(customer);

			try {
				service.addCustomer(customer);
			} catch (ServiceException e) {
				e.printStackTrace();
			}

			return "Login";
		}

	}

}
