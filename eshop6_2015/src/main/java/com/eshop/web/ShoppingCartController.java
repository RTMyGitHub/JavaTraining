package com.eshop.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eshop.dao.Product;
import com.eshop.service.ProductsService;


@Controller
public class ShoppingCartController {
	
	@Autowired
	private ProductsService service;

	@RequestMapping("/cart")
	public String addProductToCart(@RequestParam("productId") int productId, HttpSession session) {
		Product product = service.getById(productId);
		
		//any tab exists with this name
		if(session.getAttribute("ShoppingCart") == null) {
			
			//creating a tab
			List<Product> products = new ArrayList<Product>();
			
			//Adding this product to the tab
			products.add(product);
			
			//Adding this tab to the session
			session.setAttribute("ShoppingCart", products);
		} else {
			List<Product> products = (List<Product>) session.getAttribute("ShoppingCart");
			products.add(product);
		}
		
		return "ShoppingCart";
	}
}
