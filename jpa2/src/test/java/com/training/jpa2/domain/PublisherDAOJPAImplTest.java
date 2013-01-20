package com.training.jpa2.domain;

import org.junit.Ignore;
import org.junit.Test;

public class PublisherDAOJPAImplTest {

	@Test
	public void testFindByName() {
		PublisherDAO dao = new PublisherDAOJPAImpl();
		Publisher publisher = dao.findByName("Orielly");

		System.out.println("Publisher = " + publisher);
		System.out.println("Books = " + publisher.getBooks());
	}

	@Ignore
	public void testCreate() {
		
		Publisher publisher = new Publisher();
		
		publisher.setName("Apple Press");
		publisher.setAddress("One Infinite Loop");
		publisher.setCity("Cupertino");
		publisher.setZipCode("12345");
		
		PublisherDAO dao = new PublisherDAOJPAImpl();
		dao.create(publisher);
	}

}
