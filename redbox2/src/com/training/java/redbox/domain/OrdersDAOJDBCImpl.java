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
				long id = rs.getLong("id");
				long customer_id = rs.getLong("customer_id");
				long movie_id = rs.getLong("movie_id");
				long rental_days = rs.getLong("rental_days");

				Orders orders = new Orders(id, customer_id, movie_id,
						rental_days);
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
			stmt = con.prepareStatement("insert into orders values(?,?,?,?)");

			stmt.setLong(1, orders.getId());
			stmt.setLong(2, orders.getCustomer_id());
			stmt.setLong(3, orders.getMovie_id());
			stmt.setLong(4, orders.getRental_days());

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
			stmt = con.prepareStatement("select * from order where id = ?");
			stmt.setLong(1, id);
			rs = stmt.executeQuery();

			if (rs.next()) {
				long Id = rs.getLong("id");
				long customer_id = rs.getLong("customer_id");
				long movie_id = rs.getLong("movie_id");
				long rental_days = rs.getLong("rental_days");

				order = new Orders(id, customer_id, movie_id, rental_days);
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
						.prepareStatement("update orders set id = ?, customer_id= ?, movie_id = ?, rental_days = ? where id = ?");
				stmt.setLong(1, orders.getId());
				stmt.setLong(2, orders.getCustomer_id());
				stmt.setLong(3, orders.getMovie_id());
				stmt.setLong(4, orders.getRental_days());

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

}
