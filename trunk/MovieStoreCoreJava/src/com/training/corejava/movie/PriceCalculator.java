package com.training.corejava.movie;

import java.util.List;

public class PriceCalculator {

	public static final double DVD_PERDAY_PRICE = 1.20;
	public static final double BLUERAY_PERDAY_PRICE = 1.50;
	public static final double TAX_PERCENTAGE = 6.0;

	public double calculate(List<Rental> rentals, Promotion promotion) {

		double price = 0;

		for (Rental rental : rentals) {
			int numberOfDays = rental.getNoOfDays();
			MovieType movieType = rental.getMovie().getMovieType();

			double perDayPrice = getPerDayPrice(movieType);

			price = price + (perDayPrice * numberOfDays);
		}

		double discount = price * (promotion.getDiscountPercentage() / 100);

		double priceAfterDiscount = price - discount;

		double tax = priceAfterDiscount * (TAX_PERCENTAGE / 100);

		return priceAfterDiscount + tax;
	}

	private double getPerDayPrice(MovieType movieType) {

		if (movieType.equals(MovieType.DVD)) {
			return DVD_PERDAY_PRICE;
		} else {
			return BLUERAY_PERDAY_PRICE;
		}
	}

}
