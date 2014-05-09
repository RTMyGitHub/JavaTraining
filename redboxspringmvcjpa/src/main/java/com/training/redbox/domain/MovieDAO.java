package com.training.redbox.domain;

import java.util.List;

/**
 * This is a Data Access object Interface.
 * 
 * @author Satya
 * 
 */

public interface MovieDAO {

	// Contract
	List<Movie> getAllMovies() throws DAOException;

	void addMovie(Movie movie) throws DAOException;

	void updateMovie(Movie movie) throws DAOException;

	void deleteMovie(long id) throws DAOException;

	Movie findByPrimaryKey(long id) throws DAOException;

}
