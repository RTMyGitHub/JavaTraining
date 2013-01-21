package com.training.jpa2.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class BookDAOJPAImpl implements BookDAO {
	
	@PersistenceContext
    private EntityManager em;	

	public void create(Book book) {
		em.persist(book);
	}

	public Book findByPrimaryKey(int id) {
		return em.find(Book.class, id);
	}

	public void update(Book book) {
		em.merge(book);
	}
	
	public void delete(int id) {
		Book book = em.find(Book.class, id);
		em.remove(book);
	}
}
