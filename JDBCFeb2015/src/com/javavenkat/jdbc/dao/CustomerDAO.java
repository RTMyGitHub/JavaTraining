package com.javavenkat.jdbc.dao;

import java.util.List;

public interface CustomerDAO {
	
	List<Customer> getAllCustomers() throws DAOException;
	void createCustomer(Customer customer) throws DAOException;
	void updateCustomer(Customer customer) throws DAOException;
	void deleteCustomer(int customerId) throws DAOException;

}
