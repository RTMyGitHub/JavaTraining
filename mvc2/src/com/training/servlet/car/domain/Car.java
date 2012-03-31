package com.training.servlet.car.domain;

public class Car {
	private int id;
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Car(int id,String make, String model, int year, double price) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public int getId() {
		return id;
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
