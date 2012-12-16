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

	@Override
	public Book getById(int id) throws ServiceException {
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		try {
			return dao.findByPrimaryKey(id);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
		
	}

	@Override
	public void update(Book book) throws ServiceException {
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		try {
			dao.updateBook(book);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}

	@Override
	public void delete(int id) throws ServiceException {
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		try {
			dao.deleteBook(id);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}
}
