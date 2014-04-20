package com.training.venkat.spring1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	@Qualifier("jdbc")
	private MovieDAO dao;
	
	public List<Movie> getBluerayMovies() {
		
		List<Movie> allMovies = dao.getMovies();
		
		List<Movie> bluerayMovies = new ArrayList<Movie>();
		
		for(Movie movie : allMovies)
		{
			if(movie.getType().equalsIgnoreCase("BLURAY"))
			{
				bluerayMovies.add(movie);
			}
		}
		
		return bluerayMovies;
	}
}
