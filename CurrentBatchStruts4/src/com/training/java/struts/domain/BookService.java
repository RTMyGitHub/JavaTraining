package com.training.java.struts.domain;

import java.util.List;

public interface BookService {
	
	List<Book> getAllBooks() throws ServiceException;

	void addBook(Book book) throws ServiceException;

}
