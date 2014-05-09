package com.training.redbox.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	@Qualifier("customerDAOJPAImpl")
	private CustomerDAO dao;

	@Override
	@Transactional
	public void addCustomer(Customer customer) throws ServiceException {
		try {
			dao.addCustomer(customer);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}

}
