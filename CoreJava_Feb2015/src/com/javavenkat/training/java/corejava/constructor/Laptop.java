package com.javavenkat.training.java.corejava.constructor;

public class Laptop {

	private String make;
	private String model;
	private String serialNumber;
	private int displaySize;

	public Laptop(String make, String model, String serialNumber,
			int displaySize) {
		super();
		this.make = make;
		this.model = model;
		this.serialNumber = serialNumber;
		this.displaySize = displaySize;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public int getDisplaySize() {
		return displaySize;
	}

}
