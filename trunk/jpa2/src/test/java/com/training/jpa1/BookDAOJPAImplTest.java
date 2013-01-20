package com.training.jpa1;

import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

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

		// If Cascade persist or Cascade ALL if ON, if this publisher doesn't
		// exist, it will create a new publisher first and then inserts its key in book table
		Publisher publisher = new Publisher();

		publisher.setName("Orielly");
		publisher.setAddress("1234 Main St");
		publisher.setCity("Troy");
		publisher.setZipCode("48084");

		book.setPublisher(publisher);

		dao.create(book);
	}

	@Test
	public void testFindByPrimaryKey() throws Exception {

		BookDAO dao = new BookDAOJPAImpl();

		Book book = dao.findByPrimaryKey(7);

		System.out.println("book = " + book);
		System.out.println("Publisher = " + book.getPublisher());
	}

	@Ignore
	public void testUpdate() throws Exception {

		BookDAO dao = new BookDAOJPAImpl();

		Book book = dao.findByPrimaryKey(4);

		book.setAuthor("Cathy Sierra & Bert Bates");

		dao.update(book);
	}

	@Ignore
	public void testDelete() throws Exception {
		BookDAO dao = new BookDAOJPAImpl();
		dao.delete(4);
	}

}
