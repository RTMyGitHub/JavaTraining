package com.javavenkat.training.java.corejava.constructor;

public class Car {

	private String vin;
	private String make;
	private String model;

	private int currentGear;
	private int currentSpeed;
	private int maximumSpeed = 140;
	
	void start() {

		String name = "12345";

		System.out.println("starting " + this.vin + " " + make + " " + model);
	}

	void stop() {
		System.out.println("stopping " + vin + " " + make + " " + model);
	}

	public int accelerate(int speed) {

		int desiredSpeed = currentSpeed + speed;

		if (desiredSpeed > maximumSpeed) {
			currentSpeed = maximumSpeed;
		} else {
			currentSpeed = desiredSpeed;
		}

		System.out.println("you are now driving at " + currentSpeed);

		return currentSpeed;
	}

	public String getVin() {
		return vin;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

}
