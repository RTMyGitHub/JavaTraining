package com.training.java.hibernate;


import java.util.List;

public interface BookDAO {
	
	public void create(Book aNewBook) throws DAOException;
	public List<Book> getAllBooks() throws DAOException;
	public Book findByPrimaryKey(int id) throws DAOException;
	public void update(Book bookToUpdate) throws DAOException;
	public void delete(int id) throws DAOException;
}
