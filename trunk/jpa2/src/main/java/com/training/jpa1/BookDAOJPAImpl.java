package com.training.jpa1;

import javax.persistence.EntityManager;

import com.training.jpa.util.EntityManagerUtil;

public class BookDAOJPAImpl implements BookDAO {

	public void create(Book book) {
		
		EntityManager em = EntityManagerUtil.getEMF().createEntityManager();
		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();
	}

	public Book findByPrimaryKey(int id) {
		EntityManager em = EntityManagerUtil.getEMF().createEntityManager();
		return em.find(Book.class, id);
	}

	public void update(Book book) {
		EntityManager em = EntityManagerUtil.getEMF().createEntityManager();
		
		em.getTransaction().begin();
		em.merge(book);
		em.getTransaction().commit();
		
	}

	public void delete(int id) {
		EntityManager em = EntityManagerUtil.getEMF().createEntityManager();
		
		Book book = em.find(Book.class, id);
		
		em.getTransaction().begin();
		em.remove(book);
		em.getTransaction().commit();
	}
}
