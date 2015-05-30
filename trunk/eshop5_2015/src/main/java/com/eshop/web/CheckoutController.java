package com.eshop.web;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.Order;
import com.eshop.dao.Product;
import com.eshop.service.OrdersService;

@Controller
public class CheckoutController {

	@Autowired
	private OrdersService service;
	
	@RequestMapping("/checkout")
	public ModelAndView checkout(HttpSession session) {
		List<Product> products = (List<Product>) session
				.getAttribute("ShoppingCart");

		double orderAmount = calculateOrderAmount(products);

		String orderNumber = UUID.randomUUID().toString();

		Order order = new Order(0, orderNumber, new Date(), orderAmount,
				products);

		service.placeOrder(1, order);

		session.removeAttribute("ShoppingCart");

		return new ModelAndView("OrderConfirmation", "Order", order);
	}

	private double calculateOrderAmount(List<Product> products) {
		double orderAmount = 0;

		for (Product product : products) {
			orderAmount = orderAmount + product.getPrice();
		}

		return orderAmount;
	}

}
