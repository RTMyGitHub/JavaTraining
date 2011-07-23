package com.training.java.hibernate;


import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class BookDAOTest {
	
	public void getAllBooks()
	{
		BookDAO dao = new BookDAOHibernateImpl();
		
		try
		{
			List<Book> books = dao.getAllBooks();
			Iterator<Book> ite = books.iterator();
			while(ite.hasNext())
			{
				Book eachBook = ite.next();
				System.out.println("Book id = " + eachBook.getId());
				System.out.println("Book author = " + eachBook.getAuthor());
				System.out.println("Book title = " + eachBook.getTitle());
				System.out.println("Book ISBN = " + eachBook.getIsbn());
				System.out.println("Book pages = " + eachBook.getPages());
				System.out.println("Book publisher ID = " + eachBook.getPublisherId());
			}
			
		} catch (DAOException e)
		{
			e.printStackTrace();
			fail("Error occured while retrieving all books from database");
		}
	}
	
	public void findByPrimaryKey() throws DAOException
	{
		BookDAO dao = new BookDAOHibernateImpl();
		
		Book book = dao.findByPrimaryKey(2);
		
		System.out.println("Book id = " + book.getId());
		System.out.println("Book author = " + book.getAuthor());
		System.out.println("Book title = " + book.getTitle());
		System.out.println("Book ISBN = " + book.getIsbn());
		System.out.println("Book pages = " + book.getPages());
		System.out.println("Book publisher ID = " + book.getPublisherId());
	}

	public void create() throws DAOException
	{
		Book book = new Book();
		
		book.setAuthor("Venkat");
		book.setIsbn("999999");
		book.setPages(456);
		book.setPublisherId(10);
		book.setTitle("2 States");
		
		BookDAO dao = new BookDAOHibernateImpl();
		
		dao.create(book);
	}
	
	
	public void update() throws DAOException
	{
		BookDAO dao = new BookDAOHibernateImpl();
		
		Book existingBook = dao.findByPrimaryKey(2);
		existingBook.setTitle("3 States");
		dao.update(existingBook);
	}
	
	@Test
	public void delete() throws DAOException
	{
		BookDAO dao = new BookDAOHibernateImpl();
		
		dao.delete(1);
	}
}
