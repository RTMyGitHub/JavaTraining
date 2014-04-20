package com.training.java.redbox.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class CustomerDaoJdbcImpl extends BaseDAO implements CustomerDAO {

	@Override
	public List<Customer> getAllCustomers() throws DAOException {
		
		List<Customer> customers = new ArrayList<Customer>();

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {

			con = getConnection();
			statement = con.createStatement();
			resultSet = statement.executeQuery("select * from customers");

			while (resultSet.next()) {
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

				customers.add(customer);

			}

		} catch (SQLException e) {
			throw new DAOException("An unexpected error occured while accessing the database.", e);
		}  finally {

			closeResources(con, statement, resultSet);

		}

		return customers;


	}

	@Override
	public void addCustomer(Customer customer) throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		Statement statement1 = null;
		long customerId = 0;
		try {
			con = getConnection();
			
			statement1 = con.createStatement();
			ResultSet resultSet = statement1.executeQuery("select customer_seq.NEXTVAL from dual");
			
			while (resultSet.next()) {
				customerId = resultSet.getLong(1);
			}
			
			statement = con.prepareStatement("insert into customers values(?,?,?,?,?,?,?,?,?)");
			
			statement.setLong(1,customerId);
			statement.setString(2, customer.getFirstName());
			statement.setString(3, customer.getLastName());
			statement.setString(4, customer.getAddress());
			statement.setString(5, customer.getCity());
			statement.setString(6, customer.getState());
			statement.setString(7, customer.getZipCode());
			statement.setString(8, customer.getUserName());
			statement.setString(9, customer.getPassword());

			statement.executeUpdate();

		} catch (SQLException ex) {
			throw new DAOException("unable to execute operation", ex);
		} finally 
		{
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (statement1 != null) {
				try {
					statement1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
				
	}

	@Override
	public void updateCustomer(Customer customer) throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		
		long customerId=customer.getCustomerId();
		String address= customer.getAddress();
		String city= customer.getCity();
		String state= customer.getState();
		String zipcode= customer.getZipCode();
		String username= customer.getUserName();
		String password= customer.getPassword();
		
		try {
			con = getConnection();
			statement = con.prepareStatement("update customers set address=?,city=?, state=?,zipcode=?,username=?,password=? where customer_id = ?");
			statement.setString(1,address);
			statement.setString(2,city);
			statement.setString(3,state );
			statement.setString(4,zipcode );
			statement.setString(5, username);
			statement.setString(6,password );
			statement.setLong(7, customerId);
						
			int noOfRowsUpdated= statement.executeUpdate();
			System.out.println("noOfRowsUpdated= "+ noOfRowsUpdated);
			
		
		}  catch (SQLException ex) {
			throw new DAOException("unable to execute operation", ex);
		} finally 
		{
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		



		
	}

	@Override
	public void deleteCustomer(String customerId) throws DAOException {
		Connection con = null;
		PreparedStatement statement = null;
		
		
		try {
			con = getConnection();
			statement = con.prepareStatement("delete from customers where customer_id=?");
			statement.setString(1, customerId);

		statement.executeUpdate();
		//	System.out.println("no of rows deleted: "+ noOfRowsDeleted );

		} catch (SQLException ex) {
			throw new DAOException("unable to execute operation", ex);
		} finally 
		{
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public Customer findCustomerByCustomerId(String customerId)
			throws DAOException {
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
			
		long customer_id=0 ;
		String username =null;
		String password=null ;
		String firstname=null ;
		String lastname=null ;
		String address=null ;
		String city=null ;
		String state=null ;
		String zipcode=null ;
		
		Customer customer;
 
		try{
			con = getConnection();
			statement = con.prepareStatement("Select * from customers where  customer_id = ?");

			statement.setString(1, customerId);
			resultSet = statement.executeQuery();

			if (resultSet.next()) 
			{
				customer_id = resultSet.getLong("customer_id");
				username= resultSet.getString("username");
				 password = resultSet.getString("password");
				firstname = resultSet.getString("first_name");
				lastname = resultSet.getString("last_name");
				address = resultSet.getString("address");
				city = resultSet.getString("city");
				state = resultSet.getString("state");
				zipcode = resultSet.getString("zipcode");
			}

			int noOfRowsUpdated = statement.executeUpdate();
			
			customer = new Customer(customer_id,firstname,lastname);
			customer.setUserName(username);
			customer.setPassword(password);
			customer.setAddress(address);
			customer.setCity(city);
			customer.setState(state);
			customer.setZipCode(zipcode);;
			
			
		}  catch (SQLException ex) {
			throw new DAOException("unable to execute operation", ex);
		} finally 
		{
			closeResources(con, statement, resultSet);	
		}
		

		return customer;

		
	}

	@Override
	public Customer findCustomerByUsername(String username) throws DAOException {

		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
			
		long customer_id=0 ;
		String password=null ;
		String firstname=null ;
		String lastname=null ;
		String address=null ;
		String city=null ;
		String state=null ;
		String zipcode=null ;
		
		
		Customer customer = null;
 
		try{
			con = getConnection();
			statement = con.prepareStatement("Select * from customers where  username = ?");

			statement.setString(1, username);
			resultSet = statement.executeQuery();

			if (resultSet.next()) 
			{
				customer_id = resultSet.getLong("customer_id");
				password = resultSet.getString("password");
				firstname = resultSet.getString("first_name");
				lastname = resultSet.getString("last_name");
				address = resultSet.getString("address");
				city = resultSet.getString("city");
				state = resultSet.getString("state");
				zipcode = resultSet.getString("zipcode");
							
			
				customer = new Customer(customer_id,firstname,lastname);
				customer.setUserName(username);
				customer.setPassword(password);
				customer.setAddress(address);
				customer.setCity(city);
				customer.setState(state);
				customer.setZipCode(zipcode);			

			}
			
			
		}  catch (SQLException ex) {
			throw new DAOException("unable to execute operation", ex);
		} finally 
		{
			closeResources(con, statement, resultSet);	
		}
		

		return customer;

		
	}

	@Override
	public Customer findByUsernameAndPassword(String username, String password)
			throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
			
		long customer_id=0 ;
		String firstname=null ;
		String lastname=null ;
		String address=null ;
		String city=null ;
		String state=null ;
		String zipcode=null ;		
		
		Customer customer = null;
 
		try{
			con = getConnection();
			statement = con.prepareStatement("Select * from customers where  username = ? and password=?");

			statement.setString(1, username);
			statement.setString(2, password);
			resultSet = statement.executeQuery();

			if (resultSet.next()) 
			{
				customer_id = resultSet.getLong("customer_id");
				
				firstname = resultSet.getString("first_name");
				lastname = resultSet.getString("last_name");
				address = resultSet.getString("address");
				city = resultSet.getString("city");
				state = resultSet.getString("state");
				zipcode = resultSet.getString("zipcode");
							
			
				customer = new Customer(customer_id,firstname,lastname);
				customer.setUserName(username);
				customer.setPassword(password);
				customer.setAddress(address);
				customer.setCity(city);
				customer.setState(state);
				customer.setZipCode(zipcode);			

			}
			
			
		}  catch (SQLException ex) {
			throw new DAOException("unable to execute operation", ex);
		} finally 
		{
			closeResources(con, statement, resultSet);	
		}
		

		return customer;
	}
}

	


