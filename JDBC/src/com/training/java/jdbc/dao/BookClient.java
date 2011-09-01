package com.training.java.jdbc.dao;

import static org.junit.Assert.fail;

import java.util.List;

public class BookClient
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		BookDAO dao = new BookDAOJDBCImpl("jdbc:mysql://localhost/training", "root", "password");
		
		try
		{
			List<Book> books = dao.getAllBooks();
			
			for(Book eachBook : books)
			{
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
