package com.training.corejava.movie;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Rental> rentals = new ArrayList<Rental>();

	public void add(String title, String type, int numberOfDays) {
		MovieType movieType = MovieType.valueOf(type);
		Movie movie = new Movie(title, movieType);

		Rental rental = new Rental(movie, numberOfDays);

		rentals.add(rental);
	}

	/**
	 * @return the rentals
	 */
	public List<Rental> getRentals() {
		return rentals;
	}
}
