package com.training.java.moviestore.domain;

import java.util.List;

public interface MovieDAO
{
	void create(Movie movie);
	List<Movie> getMovies();
}
