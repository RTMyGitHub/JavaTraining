package com.javavenkat.jdbc.dao;

import java.util.List;

public class CustomerDAOJDBCImplDemo {

	public static void main(String[] args) throws DAOException {
		
		CustomerDAO dao = new CustomerDAOJDBCImpl();
		
		List<Customer> customers = dao.getAllCustomers();

		for(Customer c : customers)
		{
			System.out.println("First name = " + c.getFirstName());
		}
		
		/*Customer customer = new Customer(6, "Jyothy", "JL", "123 Jyothy Blvd", "Dullas", "TX", "45123");
		dao.createCustomer(customer);*/
		
		/*Customer customer = new Customer(6, "Jyothy", "JL", "999 Plano Dr", "Plano", "TX", "98765");
		dao.updateCustomer(customer);*/
		
		dao.deleteCustomer(6);
		
	}

}
