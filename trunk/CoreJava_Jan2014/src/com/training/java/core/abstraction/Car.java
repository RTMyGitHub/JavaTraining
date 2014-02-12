package com.training.java.core.abstraction;

public abstract class Car {

	private String make;
	private String model;
	private int year;
	public final int maximumSpeed = 140;
	private int currentSpeed;
	private String color;
	private boolean started;

	public Car() {
	}

	Car(String make, String model, int year) {
		this.model = model;
		this.make = make;
		this.year = year;
	}

	Car(String make, String model, int year, String color) {
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
	}

	void start() {
		System.out.println("I am starting the car");
		started = true;

		currentSpeed = 0;
	}

	void stop() {
		System.out.println("Stopping the car");
		started = false;
		currentSpeed = 0;
	}

	protected void changeColor(String newColor) {
		color = newColor;
	}
	
	public abstract int accelerate(int howMuch);

	// ************

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

}
