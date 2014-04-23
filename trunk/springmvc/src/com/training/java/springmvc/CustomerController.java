package com.training.java.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@RequestMapping("/customers")
	public ModelAndView getAllCustomers()
	{
		ModelAndView modelAndView = new ModelAndView();
		try {
			List<Customer> customers = service.getAllCustomers();
			
			modelAndView.addObject("customers", customers);
			modelAndView.setViewName("CustomersList");
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return modelAndView;
	}
	
	
}
