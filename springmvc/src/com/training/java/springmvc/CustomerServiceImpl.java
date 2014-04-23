package com.training.java.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO dao;

	@Override
	public void addCustomer(Customer customer) throws ServiceException {
		try {
			dao.addCustomer(customer);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}

	@Override
	public List<Customer> getAllCustomers() throws ServiceException {
		try {
			return dao.getAllCustomers();
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}

}
