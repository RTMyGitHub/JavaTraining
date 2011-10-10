package com.training.moviestore.domain;

import java.util.List;


public interface MovieService
{
	void create(Movie movie);
	List<Movie> getMovies();
	Movie getById(int id);
}
