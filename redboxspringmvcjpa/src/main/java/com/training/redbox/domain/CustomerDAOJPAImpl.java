package com.training.redbox.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOJPAImpl implements CustomerDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Customer> getAllCustomers() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCustomer(Customer customer) throws DAOException {
		em.persist(customer);
	}

	@Override
	public void updateCustomer(Customer customer) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(String customerId) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer findCustomerByCustomerId(String customerId)
			throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findCustomerByUsername(String username) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByUsernameAndPassword(String username, String password)
			throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
