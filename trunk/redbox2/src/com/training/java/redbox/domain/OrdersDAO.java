package com.training.java.redbox.domain;

import java.util.List;

public interface OrdersDAO {

	void createOrders(Orders orders) throws DAOException;

	List<Orders> getAllOrders() throws DAOException;

	Orders getOrdersById(long id) throws DAOException;

	void update(Orders orders) throws DAOException;

	void delete(long id) throws DAOException;
}
