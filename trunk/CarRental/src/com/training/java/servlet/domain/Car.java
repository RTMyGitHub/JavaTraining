package com.training.java.servlet.domain;

/**
 * Car class provided getters to access the instance variables.
 * 
 * @author Satya
 * 
 */

public class Car {

	private String vinNumber;
	private String make;
	private String model;
	private int year;
	private double price;

	// Constructor to Initiate Instance variables

	public Car(String vinNumber, String make, String model, int year,
			double price) {
		super();
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;

	}

	// Getter methods to access the instance Variables.

	public String getVinNumber() {
		return vinNumber;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

}
