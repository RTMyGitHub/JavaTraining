package com.eshop.dao;

import java.util.List;

public interface OrdersDAO {
	
	void createOrder(int customerId, Order order);
	List<Order> getOrdersForCustomer(int customerId);

}
