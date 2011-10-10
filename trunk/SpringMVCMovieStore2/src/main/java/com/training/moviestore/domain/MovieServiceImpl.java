package com.training.moviestore.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieServiceImpl implements MovieService
{
	@Autowired
	private MovieDAO dao;
	
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

	@Override
	public Movie getById(int id) {
		return dao.findByPrimaryKey(id);
	}
}
