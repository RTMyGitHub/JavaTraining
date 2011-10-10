package com.training.moviestore.domain;

import java.util.List;

public interface MovieDAO
{
	void create(Movie movie);
	List<Movie> getMovies();
	Movie findByPrimaryKey(int id);
}
