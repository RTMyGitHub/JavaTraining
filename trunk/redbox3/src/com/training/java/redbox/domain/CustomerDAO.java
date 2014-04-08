package com.training.java.redbox.domain;

import java.util.List;

public interface CustomerDAO {
	
	List<Customer> getAllCustomers() throws DAOException;
	void addCustomer(Customer customer)throws DAOException;
	void updateCustomer(Customer customer) throws DAOException;
	void deleteCustomer(String customerId) throws DAOException;
	Customer findCustomerByCustomerId(String customerId)throws DAOException;
	Customer findCustomerByUsername(String username)throws DAOException;
	Customer findByUsernameAndPassword(String username, String password)throws DAOException;

}


