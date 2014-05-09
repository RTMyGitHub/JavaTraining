package com.training.redbox.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoJdbcImpl implements CustomerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Customer> getAllCustomers() throws DAOException {
		return jdbcTemplate.query("select * from customers",
				new CustomerRowMapper());
	}

	@Override
	public void addCustomer(Customer customer) throws DAOException {

		jdbcTemplate
				.update("insert into customers values(customer_seq.NEXTVAL,?,?,?,?,?,?,?,?)",
						customer.getFirstName(), customer.getLastName(),
						customer.getAddress(), customer.getCity(),
						customer.getState(), customer.getZipCode(),
						customer.getUserName(), customer.getPassword());
	}

	@Override
	public void updateCustomer(Customer customer) throws DAOException {

		jdbcTemplate
				.update("update customers set address=?,city=?, state=?,zipcode=?,username=?,password=? where customer_id = ?",
						customer.getAddress(), customer.getCity(),
						customer.getState(), customer.getZipCode(),
						customer.getUserName(), customer.getPassword(),
						customer.getCustomerId());
	}

	@Override
	public void deleteCustomer(String customerId) throws DAOException {
		jdbcTemplate.update("delete from customers where customer_id=?",
				customerId);
	}

	@Override
	public Customer findCustomerByCustomerId(String customerId)
			throws DAOException {
		return jdbcTemplate.queryForObject(
				"Select * from customers where  customer_id = ?",
				new CustomerRowMapper(), customerId);
	}

	@Override
	public Customer findCustomerByUsername(String username) throws DAOException {
		return jdbcTemplate.queryForObject(
				"Select * from customers where  username = ?",
				new CustomerRowMapper(), username);
	}

	@Override
	public Customer findByUsernameAndPassword(String username, String password)
			throws DAOException {
		return jdbcTemplate.queryForObject(
				"Select * from customers where  username = ? and password=?",
				new CustomerRowMapper(), username, password);
	}

	private static final class CustomerRowMapper implements RowMapper<Customer> {
		@Override
		public Customer mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {

			long customerId = resultSet.getLong("customer_id");
			String username = resultSet.getString("username");
			String password = resultSet.getString("password");
			String firstname = resultSet.getString("first_name");
			String lastname = resultSet.getString("last_name");
			String address = resultSet.getString("address");
			String city = resultSet.getString("city");
			String state = resultSet.getString("state");
			String zipcode = resultSet.getString("zipcode");

			Customer customer = new Customer(customerId, firstname, lastname);
			customer.setAddress(address);
			customer.setCity(city);
			customer.setState(state);
			customer.setZipCode(zipcode);
			customer.setUserName(username);
			customer.setPassword(password);

			return customer;
		}

	}
}
