package com.training.java.jdbc.dao;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class BookDAOTest {
	
	@Test
	public void createShouldInsertABookInDB()
	{
		BookDAO dao = new BookDAOJDBCImpl();

		//Create a book
		Book newBook = new Book();
		newBook.setId(10);
		newBook.setAuthor("Subash");
		newBook.setIsbn("1234567");
		newBook.setPages(344);
		newBook.setPublisherId(10);
		newBook.setTitle("Hyderabad Blues");
		
		//Insert this new book in database
		try {
			dao.create(newBook);
		} catch (DAOException e) {
			e.printStackTrace();
			fail("Error occured while creating new book");
		}
	}
	
	@Test
	public void getAllBooksMethodsMustReturnAtLeastOneBook()
	{
		BookDAO dao = new BookDAOJDBCImpl();
		
		try
		{
			List<Book> books = dao.getAllBooks();
			Iterator<Book> ite = books.iterator();
			while(ite.hasNext())
			{
				Book eachBook = ite.next();
				System.out.println("Book id = " + eachBook.getId());
				System.out.println("Book id = " + eachBook.getId());
				System.out.println("Book id = " + eachBook.getId());
				System.out.println("Book id = " + eachBook.getId());
				System.out.println("Book id = " + eachBook.getId());
				System.out.println("Book id = " + eachBook.getId());
				System.out.println("Book id = " + eachBook.getId());
			}
			
			
			
		} catch (DAOException e)
		{
			e.printStackTrace();
			fail("Error occured while retrieving all books from database");
		}
	}
	
	@Test
	public void updateMethodShouldUpdateBookInDB()
	{
		BookDAO dao = new BookDAOJDBCImpl();
		
		try
		{
			Book bookFromDB = dao.findByPrimaryKey(10);
			
			//Lets change the title now
			bookFromDB.setTitle("Detroit Blues");
			
			//Now, lets update this back to database
			dao.update(bookFromDB);
			
		} catch (DAOException e1)
		{
			e1.printStackTrace();
			fail("Error occured while updating book in database");
		}
	}
	
	@Test
	public void deleteMethodShouldDeleteBookFromDB()
	{
		BookDAO dao = new BookDAOJDBCImpl();
		
		try
		{
			dao.delete(8);
		} catch (DAOException e1)
		{
			e1.printStackTrace();
			fail("Error occured while updating book in database");
		}
	}
}
