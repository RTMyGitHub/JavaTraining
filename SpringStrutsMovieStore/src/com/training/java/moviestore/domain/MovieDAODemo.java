package com.training.java.moviestore.domain;

import java.util.List;

public class MovieDAODemo
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		/*
		MovieDAO dao = new MovieDAOJDBCImpl("jdbc:mysql://localhost/training", "root", "password");
		
		Movie aMovie = new Movie();
		aMovie.setId(2);
		aMovie.setName("Speed2..CC");
		aMovie.setRating("PG-13");
		aMovie.setGenre("Thriller");
		aMovie.setReleaseDate(new Date(System.currentTimeMillis()));
		
		dao.create(aMovie);
		*/
		
		MovieDAO dao = new MovieDAOJDBCImpl("jdbc:mysql://localhost/training", "root", "password");
		
		List<Movie> movies = dao.getMovies();
		for(Movie aMovie : movies)
		{
			System.out.println("Name = " + aMovie.getName());
			System.out.println("Rating = " + aMovie.getRating());
			System.out.println("Genre = " + aMovie.getGenre());
			System.out.println("Release date = " + aMovie.getReleaseDate());
			System.out.println("id = " + aMovie.getId());
		}
	}

}
