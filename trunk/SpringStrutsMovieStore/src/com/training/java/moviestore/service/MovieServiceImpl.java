package com.training.java.moviestore.service;

import java.util.List;

import com.training.java.moviestore.domain.Movie;
import com.training.java.moviestore.domain.MovieDAO;

public class MovieServiceImpl implements MovieService
{
	private MovieDAO dao;
	
	public MovieServiceImpl(MovieDAO dao)
	{
		this.dao = dao;
	}
	
	@Override
	public void create(Movie movie)
	{
		dao.create(movie);
	}

	@Override
	public List<Movie> getMovies()
	{
		return dao.getMovies();	
	}
}
