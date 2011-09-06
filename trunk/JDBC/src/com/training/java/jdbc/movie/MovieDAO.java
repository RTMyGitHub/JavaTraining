package com.training.java.jdbc.movie;

import java.util.List;

public interface MovieDAO
{
	void create(Movie movie);
	List<Movie> getMovies();
}
