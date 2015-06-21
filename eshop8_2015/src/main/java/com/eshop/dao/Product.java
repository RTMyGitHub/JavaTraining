package com.eshop.dao;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private int id;
	private String type;
	private String name;
	private double price;

	public Product() {

	}

	public Product(int id, String type, String name, double price) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
