package com.training.redbox.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MovieDAOJPAImpl implements MovieDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Movie> getAllMovies() throws DAOException {

		Query query = em.createNamedQuery("selectAllMovies");
		return (List<Movie>) query.getResultList();
	}

	@Override
	public void addMovie(Movie movie) throws DAOException {
		em.persist(movie);
	}

	@Override
	public void updateMovie(Movie movie) throws DAOException {
		em.merge(movie);
	}

	@Override
	public void deleteMovie(long id) throws DAOException {
		Movie movie = em.find(Movie.class, id);
		em.remove(movie);
	}

	@Override
	public Movie findByPrimaryKey(long id) throws DAOException {
		return em.find(Movie.class, id);
	}

}
