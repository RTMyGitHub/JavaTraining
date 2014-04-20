package com.training.java.redbox.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrdersDAOJDBCImpl extends BaseDAO implements OrdersDAO {

	@Override
	public List<Orders> getAllOrders() throws DAOException {

		List<Orders> order = new ArrayList<Orders>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from Orders");

			while (rs.next()) {
				long orderNumber = rs.getLong("orderNumber");
				long orderId = rs.getLong("orderId");
				long customer_id = rs.getLong("customer_id");
				long movie_id = rs.getLong("movie_id");
				String status = rs.getString("status");

				Orders orders = new Orders(orderNumber, orderId, customer_id, movie_id,
						status);
				order.add(orders);
			}
			return order;

		} catch (SQLException e) {
			throw new DAOException(e);
		} finally {
			closeResources(con, stmt, rs);
		}

	}

	@Override
	public void createOrders(Orders orders) throws DAOException {
		Connection con = null;
		PreparedStatement stmt = null;


		try {
			con = getConnection();
			stmt = con.prepareStatement("insert into orders values(?,?,?,?,?)");

			stmt.setLong(1, getOrderId());
			stmt.setLong(2, orders.getOrderNumber());
			stmt.setLong(3, orders.getCustomer_id());
			stmt.setLong(4, orders.getMovie_id());
			stmt.setString(5, orders.getStatus());

			stmt.execute();

		} catch (SQLException e) {
			throw new DAOException(e);
		} finally {
			closeResources(con, stmt, null);
		}

	}

	@Override
	public Orders getOrdersById(long id) throws DAOException {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		Orders order = null;
		try {
			con = getConnection();
			stmt = con.prepareStatement("select * from order where orderId = ?");
			stmt.setLong(1, id);
			rs = stmt.executeQuery();

			if (rs.next()) {
				long orderNumber = rs.getLong("orderNumber");
				long orderId = rs.getLong("orderId");
				long customer_id = rs.getLong("customer_id");
				long movie_id = rs.getLong("movie_id");
				String status = rs.getString("status");

				order = new Orders(orderNumber, orderId, customer_id, movie_id, status);
			}
			return order;

		} catch (SQLException e) {
			throw new DAOException(e);
		} finally {
			closeResources(con, stmt, rs);
		}
	}

	@Override
	public void update(Orders orders) throws DAOException {
		{
			Connection con = null;
			PreparedStatement stmt = null;

			try {
				con = getConnection();
				stmt = con
						.prepareStatement("update orders set order_number = ?, order_id = ?, customer_id= ?, movie_id = ?, status = ? where id = ?");
				stmt.setLong(1, orders.getOrderNumber());
				stmt.setLong(2, orders.getOrderId());
				stmt.setLong(3, orders.getCustomer_id());
				stmt.setLong(4, orders.getMovie_id());
				stmt.setString(5, orders.getStatus());

				stmt.execute();

			} catch (SQLException e) {
				throw new DAOException(e);
			} finally {
				closeResources(con, stmt, null);
			}
		}

	}

	@Override
	public void delete(long id) throws DAOException {
		Connection con = null;
		PreparedStatement stmt = null;

		try {
			con = getConnection();
			stmt = con.prepareStatement("delete from orders where id = ?");
			stmt.setLong(1, id);
			stmt.execute();

		} catch (SQLException e) {
			throw new DAOException(e);
		} finally {
			closeResources(con, stmt, null);
		}

	}
	
	
	@Override
	public long createOrderNumber() throws DAOException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		long orderNumber = 0;
		

		try {
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select order_num_seq.nextval from dual");

			while (rs.next()) {
				orderNumber = rs.getLong(1);
			}
			return orderNumber;

		} catch (SQLException e) {
			throw new DAOException(e);
		} finally {
			closeResources(con, stmt, rs);
		}

	}
	
private long getOrderId() throws DAOException  {
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	long orderId = 0;
	

	try {
		con = getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select order_id_seq.nextval from dual");

		while (rs.next()) {
			orderId = rs.getLong(1);
		}
		return orderId;

	} catch (SQLException e) {
		throw new DAOException(e);
	} finally {
		closeResources(con, stmt, rs);
	}
	
	}

}
