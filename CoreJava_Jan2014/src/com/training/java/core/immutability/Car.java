package com.training.java.core.immutability;

public class Car {

	private String make = "Ford";
	private String model = "Focus";
	private int year = 2014;

	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
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

}
