package com.training.corejava.movie;

public class Rental {

	private Movie movie;
	private int noOfDays;

	public Rental(Movie movie, int noOfDays) {
		super();
		this.movie = movie;
		this.noOfDays = noOfDays;
	}

	/**
	 * @return the movie
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * @return the noOfDays
	 */
	public int getNoOfDays() {
		return noOfDays;
	}

}
