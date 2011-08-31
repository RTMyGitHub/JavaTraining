package com.training.java.jdbc.dao;

import java.util.List;

public interface BookDAO {
	
	void create(Book aNewBook) throws DAOException;
	List<Book> getAllBooks() throws DAOException;
	Book findByPrimaryKey(int id) throws DAOException;
	void update(Book bookToUpdate) throws DAOException;
	void delete(int id) throws DAOException;
}
