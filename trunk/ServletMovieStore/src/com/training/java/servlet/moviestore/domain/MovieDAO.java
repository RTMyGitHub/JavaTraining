package com.training.java.servlet.moviestore.domain;

import java.util.List;

public interface MovieDAO
{
	void create(Movie movie);
	List<Movie> getMovies();
}
