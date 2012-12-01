package com.training.java.servlet.servlet3.domain;

import java.util.List;

public interface BookDAO {
	
	List<Book> getAllBooks() throws DAOException;
	void addBook(Book book) throws DAOException;
	void updateBook(Book book) throws DAOException;
	void deleteBook(int bookId) throws DAOException;
	Book findByPrimaryKey(int bookId) throws DAOException;
	
}
