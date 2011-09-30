package com.training.java.moviestore.service;

import java.util.List;

import com.training.java.moviestore.domain.Movie;

public interface MovieService
{
	void create(Movie movie);
	List<Movie> getMovies();
}
