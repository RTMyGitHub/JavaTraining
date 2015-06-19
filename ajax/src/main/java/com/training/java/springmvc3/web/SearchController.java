package com.training.java.springmvc3.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
	
	@RequestMapping("/searchform")
	public String searchForm() {
		return "Search";
	}

	@RequestMapping("/search")
	public List<String> search(@RequestParam String key) {

		System.out.println("Search key = " + key);

		List<String> allProducts = getAllProducts();

		List<String> result = new ArrayList<String>();

		for (String product : allProducts) {
			if (product.startsWith(key)) {
				result.add(product);
			}
		}

		return result;
	}

	private List<String> getAllProducts() {
		return Arrays.asList("iPad", "iPhone", "Android Tablet by Samsung",
				"Samsung Galaxy Tab 5", "Gone with the wind",
				"Pragmatic Programmer", "Apple Watch", "Apple Watch pro",
				"Apple watch gold", "Apple watch new");
	}
}