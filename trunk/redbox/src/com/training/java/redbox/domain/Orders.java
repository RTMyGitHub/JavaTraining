package com.training.java.redbox.domain;

public class Orders {

	private long id;
	private long customer_id;
	private long movie_id;
	private long rental_days;

	public Orders(long id, long customer_id, long movie_id, long rental_days) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.movie_id = movie_id;
		this.rental_days = rental_days;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the customer_id
	 */
	public long getCustomer_id() {
		return customer_id;
	}

	/**
	 * @return the movie_id
	 */
	public long getMovie_id() {
		return movie_id;
	}

	/**
	 * @return the rental_days
	 */
	public long getRental_days() {
		return rental_days;
	}

}
