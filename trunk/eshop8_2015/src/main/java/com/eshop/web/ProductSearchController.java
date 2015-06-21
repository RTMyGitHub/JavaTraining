package com.eshop.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.Product;
import com.eshop.dao.Products;
import com.eshop.service.ProductsService;

@Controller
@RequestMapping("/product/search")
public class ProductSearchController {

	@Autowired
	private ProductsService service;

	@RequestMapping("suggestions")
	@ResponseBody
	public Products getSuggestions(@RequestParam String key) {
		List<Product> allProducts = service.getAllProducts();
		
		Products products = new Products();

		for(Product product : allProducts) {
			if(product.getName().startsWith(key)) {
				products.addProduct(product);
			}
		}

		return products;
	}
	
	@RequestMapping(value = "/", method=RequestMethod.POST)
	public ModelAndView homePage(@RequestParam String productSearch) {
		System.out.println("Real search has been called");
		List<Product> allProducts = service.getAllProducts();
		
		List<Product> resultProducts = new ArrayList<Product>();
		
		for(Product product : allProducts) {
			if(product.getName().startsWith(productSearch)) {
				resultProducts.add(product);
			}
		}		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Home");
		modelAndView.addObject("AllProducts", resultProducts);
		
		return modelAndView;
	}
}