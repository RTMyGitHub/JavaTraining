package com.training.venkat.spring1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("jdbc")
public class MovieDAOJDBCImpl implements MovieDAO {

	public List<Movie> getMovies() {

		Movie movie1 = new Movie();

		movie1.setTitle("Lego From JDBC");
		movie1.setType("Bluray");
		movie1.setRentalPrice(2.0);

		Movie movie2 = new Movie();
		movie2.setTitle("Captain America from JDBC");
		movie2.setType("Bluray");
		movie2.setRentalPrice(2.0);

		List<Movie> movies = new ArrayList<Movie>();
		movies.add(movie1);
		movies.add(movie2);

		return movies;
	}

}
