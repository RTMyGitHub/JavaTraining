package com.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.dao.Product;
import com.eshop.dao.ProductsDAO;

@Service
public class ProductsService {

	@Autowired
	private ProductsDAO dao;

	public Product getById(int productId) {
		return dao.findByPrimaryKey(productId);
	}

	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}
}
