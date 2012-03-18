package com.training.java.hibernate;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class BookDAOHibernateImplTest {
	
	@Test
	public void testList() throws Exception {
		
		BookDAO dao = new BookDAOHibernateImpl();
		List<Book> books = dao.getAllBooks();
		
		for(Book aBook : books)
		{
			System.out.println("dept name " + aBook.getPublisher().getName());
		}
		
		
		System.out.println("books size = " + books.size());
	}
	
	@Test
	public void testFindByPrimaryKey() throws Exception {
		
		BookDAO dao = new BookDAOHibernateImpl();
		Book book = dao.findByPrimaryKey(1);
		
		System.out.println("Title = " + book.getTitle());
		System.out.println("Author = " + book.getAuthor());
		System.out.println("ISBN = " + book.getIsbn());
	}
	
	
	@Ignore
	public void testAdd() throws Exception
	{
		BookDAO dao = new BookDAOHibernateImpl();
		
		Book newBook = new Book();
		newBook.setId(6);
		newBook.setAuthor("Gavin King");
		newBook.setIsbn("1234");
		newBook.setTitle("Hibernate ");
		
		Publisher pub = new Publisher();
		pub.setId(5);
		pub.setName("ABC");

		newBook.setPublisher(pub);
		
		dao.create(newBook);
	}
	
	@Ignore
	public void testUpdate() throws Exception
	{
		BookDAO dao = new BookDAOHibernateImpl();
		Book book = dao.findByPrimaryKey(1);
		
		book.setAuthor("Venkat");
		
		dao.update(book);
	}
	
	@Ignore
	public void testDelete() throws Exception
	{
		BookDAO dao = new BookDAOHibernateImpl();
		dao.delete(1);
	}
	
}
