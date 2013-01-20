package com.training.jpa1.domain;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

import com.training.jpa1.domain.Book;
import com.training.jpa1.domain.BookDAO;
import com.training.jpa1.domain.BookDAOJPAImpl;

public class BookDAOJPAImplTest {
	
	@Ignore
	public void testCreate() throws Exception {
		
		BookDAO dao = new BookDAOJPAImpl();
		
		Book book = new Book();
		book.setAuthor("Cathy Sierra");
		book.setTitle("Head First Java");
		book.setIsbn("987654");
		book.setPages(321);
		book.setPublisherDate(new Date());
		
		dao.create(book);
	}
	
	@Test
	public void testFindByPrimaryKey() throws Exception {
		
		BookDAO dao = new BookDAOJPAImpl();
		
		Book book = dao.findByPrimaryKey(4);
		
		System.out.println("book = " + book);
	}
	
	@Test
	public void testUpdate() throws Exception {
		
		BookDAO dao = new BookDAOJPAImpl();
		
		Book book = dao.findByPrimaryKey(4);
		
		book.setAuthor("Cathy Sierra & Bert Bates");
		
		dao.update(book);
	}
	
	@Test
	public void testDelete() throws Exception {
		BookDAO dao = new BookDAOJPAImpl();
		dao.delete(4);
	}

}
