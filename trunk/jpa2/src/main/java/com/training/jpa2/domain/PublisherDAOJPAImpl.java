package com.training.jpa2.domain;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.training.jpa.util.EntityManagerUtil;

public class PublisherDAOJPAImpl implements PublisherDAO {

	public void create(Publisher publisher) {
		
		EntityManager em = EntityManagerUtil.getEMF().createEntityManager();
		em.getTransaction().begin();
		em.persist(publisher);
		em.getTransaction().commit();
	}

	public Publisher findByName(String name) {
		EntityManager em = EntityManagerUtil.getEMF().createEntityManager();
		
		Query query = em.createQuery("select pub from Publisher pub where pub.name = ?");
		query.setParameter(1, name);
		
		return (Publisher) query.getSingleResult();
	}

}
