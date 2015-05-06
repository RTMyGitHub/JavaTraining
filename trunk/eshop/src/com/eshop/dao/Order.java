package com.eshop.dao;

import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	// we added this field
	private int cust_Id;
	private String orderNumber;
	private Date orderDate;
	private double orderAmount;

	private List<Product> products = null;

	public Order(int id, int cust_Id, String orderNumber, Date orderDate,
			double orderAmount, List<Product> products) {
		super();
		this.id = id;
		this.cust_Id = cust_Id;
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public int getCust_Id() {
		return cust_Id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public List<Product> getProducts() {
		return products;
	}
}
