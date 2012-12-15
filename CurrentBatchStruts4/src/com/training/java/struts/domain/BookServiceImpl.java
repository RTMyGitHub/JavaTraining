package com.training.java.struts.domain;

import java.util.List;

public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getAllBooks() throws ServiceException {
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		try {
			return dao.getAllBooks();
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}

	@Override
	public void addBook(Book book) throws ServiceException {
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		try {
			dao.addBook(book);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}
}
