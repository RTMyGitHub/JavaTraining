package com.training.jpa2.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class PublisherDAOJPAImpl implements PublisherDAO {
	
	@PersistenceContext(unitName="bookStore")
	private EntityManager em;

	public void create(Publisher publisher) {
		em.persist(publisher);
	}

	public Publisher findByName(String name) {
		
		Query query = em.createQuery("select pub from Publisher pub where pub.name = ?");
		query.setParameter(1, name);
		
		return (Publisher) query.getSingleResult();
	}

}
