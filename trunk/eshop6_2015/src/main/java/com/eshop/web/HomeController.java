package com.eshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.Product;
import com.eshop.service.ProductsService;

@Controller
public class HomeController {
	
	@Autowired
	private ProductsService service;
	
	@RequestMapping("/")
	public ModelAndView homePage() {
		List<Product> products = service.getAllProducts();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Home");
		modelAndView.addObject("AllProducts", products);
		
		return modelAndView;
	}
}
