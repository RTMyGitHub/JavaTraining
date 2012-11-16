package com.training.java.jdbc.dao.two;

import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class BookDAOJDBCImplTest {
	
	@Test
	public void testGetAllBooks() throws Exception {
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		List<Book> books = dao.getAllBooks();
		
		Assert.assertNotNull(books);
		Assert.assertFalse(books.isEmpty());
		
		for(Book book : books)
		{
			System.out.println("Author = " + book.getAuthor());
			System.out.println("Title = " + book.getTitle());
			System.out.println("*************************");
		}
	}
	
	@Test
	public void testAddBook() throws DAOException  {
		
		Book book = new Book(1, "Pragmattic Programmer", "Dave Thomas", "9876543", 230, new Date());
		
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		dao.addBook(book);
		
		//verify that this book is added
		List<Book> books = dao.getAllBooks();
		
		Assert.assertNotNull(books);
		Assert.assertFalse(books.isEmpty());
	}
	
	@Test
	public void testFindByPrimaryKey() throws DAOException
	{
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		Book book = dao.findByPrimaryKey(1);
		
		Assert.assertNotNull(book);
		Assert.assertEquals(1, book.getId());
		Assert.assertEquals("Dave Thomas", book.getAuthor());
	}
	
	@Test
	public void testUpdate() throws DAOException
	{
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		Book book = dao.findByPrimaryKey(2);
		
		book.setAuthor("Venkat");
		
		dao.updateBook(book);
		
		Book updatedBook = dao.findByPrimaryKey(2);
		
		Assert.assertNotNull(updatedBook);
		Assert.assertEquals("Venkat", updatedBook.getAuthor());
	}
	
	@Test
	public void testDelete()
	{
		BookDAO dao = new BookDAOJDBCImpl("jdbc:oracle:thin:@localhost:1521:XE", "bookstore", "password");
		
		try {
			dao.deleteBook(1);
		} catch (DAOException e) {
			TestCase.fail("Got DAOException while deleting");
		}
		
		try {
			dao.findByPrimaryKey(1);
			TestCase.fail("DAOException is expected here, but not thrown..So, delete must not be successful!!");
		} catch (DAOException e) {
			//expected
		}
	}

}
