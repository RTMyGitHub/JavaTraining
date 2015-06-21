package com.eshop.dao;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "products")
public class Products {

	private List<Product> products = new ArrayList<Product>();

	@XmlElement(name = "product")
	public List<Product> getProducts() {
		return products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
