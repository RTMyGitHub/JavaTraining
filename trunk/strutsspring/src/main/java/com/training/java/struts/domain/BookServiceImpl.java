package com.training.java.struts.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDAO dao;

	@Override
	public List<Book> getAllBooks() throws ServiceException {
		
		try {
			return dao.getAllBooks();
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}

	@Override
	public void addBook(Book book) throws ServiceException {
		try {
			dao.addBook(book);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}

	@Override
	public Book getById(int id) throws ServiceException {
		try {
			return dao.findByPrimaryKey(id);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
		
	}

	@Override
	public void update(Book book) throws ServiceException {
		try {
			dao.updateBook(book);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}

	@Override
	public void delete(int id) throws ServiceException {
		try {
			dao.deleteBook(id);
		} catch (DAOException ex) {
			ex.printStackTrace();
			throw new ServiceException(ex);
		}
	}
}
