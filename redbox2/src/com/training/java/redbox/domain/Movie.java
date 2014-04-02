package com.training.java.redbox.domain;

public class Movie {

	private long id;
	private String type;
	private String title;
	private double rentalPrice;
	private String imageLocation;

	// constructor

	public Movie(long id, String type, String title, double rentalPrice,
			String imageLocation) {
		super();
		this.id = id;
		this.type = type;
		this.title = title;
		this.rentalPrice = rentalPrice;
		this.imageLocation = imageLocation;
	}

	// getters

	public long getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getTitle() {
		return title;
	}

	public double rentalPrice() {
		return rentalPrice;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageLocation() {
		return imageLocation;
	}

}