package com.training.redbox.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="movieIdGenerator", sequenceName="movie_id_seq", allocationSize=1)
@NamedQuery(name="selectAllMovies", query="from Movie")
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="movieIdGenerator")
	private long id;
	private String type;
	private String title;

	@Column(name = "rental_price")
	private double rentalPrice;

	@Column(name = "image_location")
	private String imageLocation;

	// constructor
	public Movie() {
	}

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

	public void setId(long id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}
}