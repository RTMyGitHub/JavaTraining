package com.javavenkat.jdbc.dao;

import java.util.List;

public interface CustomerDAO {
	
	List<Customer> getAllCustomers();
	void createCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(int customerId);

}
