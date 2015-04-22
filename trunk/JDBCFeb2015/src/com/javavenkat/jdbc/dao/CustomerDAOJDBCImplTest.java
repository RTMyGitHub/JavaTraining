package com.javavenkat.jdbc.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerDAOJDBCImplTest {

	private CustomerDAO dao;

	@Before
	public void setup() {
		dao = new CustomerDAOJDBCImpl();
	}

	@Test
	public void testSelect() throws DAOException {

		List<Customer> customers = dao.getAllCustomers();
		
		Assert.assertFalse(customers.isEmpty());
		Assert.assertTrue(customers.size() > 3);
	}
}
