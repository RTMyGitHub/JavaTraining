package com.training.java.struts.domain;

import java.util.List;

public interface BookService {
	
	List<Book> getAllBooks() throws ServiceException;

	void addBook(Book book) throws ServiceException;

	Book getById(int id) throws ServiceException;

	void update(Book book) throws ServiceException;

	void delete(int id) throws ServiceException;

}
