package com.training.corejava.movie;

public class Movie {

	private String title;
	private MovieType movieType;

	public Movie(String title,
			MovieType movieType) {
		super();
		this.title = title;
		this.movieType = movieType;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the movieType
	 */
	public MovieType getMovieType() {
		return movieType;
	}
}
