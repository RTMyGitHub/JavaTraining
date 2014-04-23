package com.training.java.springmvc;

import java.util.List;

public interface CustomerService {
	
	void addCustomer(Customer customer) throws ServiceException;
	List<Customer> getAllCustomers() throws ServiceException;

}
