package com.training.java.redbox.domain;

public class Orders {

	private long orderId;
	private long orderNumber;
	private long customer_id;
	private long movie_id;
	private String status;

	public Orders(long orderNumber, long orderId, long customer_id, long movie_id, String status) {
		super();
		this.orderNumber = orderNumber;
		this.orderId = orderId;
		this.customer_id = customer_id;
		this.movie_id = movie_id;
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public long getOrderId() {
		return orderId;
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
	public String getStatus() {
		return status;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

}
