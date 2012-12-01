package com.training.java.servlet.movie.domain;

import java.util.List;

public interface MovieDao {

	List<Movie> getAllMovies();
	void addMovies(Movie m);
	Movie GetById(int movieId);
	void update(Movie movie);
	void delete(int movieid);
	
}
