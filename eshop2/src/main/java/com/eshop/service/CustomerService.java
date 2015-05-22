package com.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.dao.Customer;
import com.eshop.dao.CustomerDAO;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	public List<Customer> getCustomers() {
		return dao.getAllCustomers();
	}
}
