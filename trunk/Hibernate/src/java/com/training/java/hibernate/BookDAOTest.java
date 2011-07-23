package com.training.java.hibernate;


import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class BookDAOTest {
	
	@Test
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
}
