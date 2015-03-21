package com.javavenkat.training.java.core.design;

public class Car {

	private String make;
	private String model;
	private String vin;

	private boolean started;
	private int currentSpeed;
	private boolean buckled;
	private boolean seatBeltIndicator;
	
	private Engine engine;
	private SparkPlug sparkPlug;
	
	private int maximumSpeed = 140;

	public Car(String make, String model, String vin) {
		super();
		this.make = make;
		this.model = model;
		this.vin = vin;
	}

	public void start() {
		System.out.println(make + " " + model + " is starting");
		
		engine.start(sparkPlug);
		
		started = true;
	}
	
	public void stop()
	{
		started = false;
		currentSpeed = 0;
		seatBeltIndicator = false;
	}
	
	public void buckleUp()
	{
		buckled = true;
		seatBeltIndicator = false;
	}
	
	public int accelerate(int byHowMuch)
	{
		int desiredSpeed = currentSpeed + byHowMuch;
		
		if(desiredSpeed > 0 && !buckled)
		{
			seatBeltIndicator = true;
			currentSpeed = 0;
		} else {
			seatBeltIndicator = false;
			
			if(desiredSpeed > maximumSpeed)
			{
				currentSpeed = maximumSpeed;
			} else {
				currentSpeed = desiredSpeed;
			}
		}
		
		return currentSpeed;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getVin() {
		return vin;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public boolean isBuckled() {
		return buckled;
	}

	public boolean isSeatBeltOn() {
		return seatBeltIndicator;
	}

	public boolean isStarted() {
		return started;
	}

}
