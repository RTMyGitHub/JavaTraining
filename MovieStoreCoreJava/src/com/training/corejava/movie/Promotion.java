package com.training.corejava.movie;

import java.util.Date;

public class Promotion {
	
	private String code;
	private Date expirationDate;
	private double discountPercentage;
	
	
	public Promotion(String code, Date expirationDate, int discountPercentage) {
		super();
		this.code = code;
		this.expirationDate = expirationDate;
		this.discountPercentage = discountPercentage;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}
	/**
	 * @return the discountPercentage
	 */
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	
	
	
	

}
