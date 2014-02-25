package com.training.corejava.movie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieLibrary {

	private static List<Movie> movies;

	static {
		movies = new ArrayList<>();

		Movie lego1 = new Movie("Lego", MovieType.Blueray);
		Movie lego2 = new Movie("Lego", MovieType.Blueray);
		Movie lego3 = new Movie("Lego", MovieType.DVD);

		Movie frozen1 = new Movie("Frozen", MovieType.DVD);
		Movie frozen2 = new Movie("Frozen", MovieType.Blueray);
		Movie frozen3 = new Movie("Frozen", MovieType.Blueray);

		movies.add(lego1);
		movies.add(lego2);
		movies.add(lego3);
		movies.add(frozen1);
		movies.add(frozen2);
		movies.add(frozen3);

	}

	public boolean inStock(String title) {

		for (Movie movie : movies) {

			if (movie.getTitle().equalsIgnoreCase(title)) {
				return true;
			}
		}

		return false;
	}

	public void deleteMovie(String title, MovieType movieType) {
		Iterator<Movie> ite = movies.iterator();

		while (ite.hasNext()) {
			Movie movie = ite.next();

			if (movie.getTitle().equalsIgnoreCase(title)
					&& movie.getMovieType().equals(movieType)) {
				ite.remove();
			}
		}
	}

}
