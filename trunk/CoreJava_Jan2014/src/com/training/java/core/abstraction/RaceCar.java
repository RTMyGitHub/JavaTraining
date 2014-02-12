package com.training.java.core.abstraction;

public class RaceCar extends Car {

	private boolean nitro;

	public RaceCar() {
		super();
	}

	RaceCar(int year, String make, String model, boolean nitro) {
		super(make, model, year);

		this.nitro = nitro;
	}

	void race() {
		System.out.println("I am racing");
		accelerate(getMaximumSpeed());

	}

	@Override
	void start() {
		System.out.println("I am starting my RaceCar...rumm..!!");
	}

	@Override
	public int accelerate(int howMuch) {
		
		int wishfulCurrentSpeed = getCurrentSpeed() + howMuch + 50;

		if (wishfulCurrentSpeed > getMaximumSpeed()) {
			setCurrentSpeed(getMaximumSpeed());
		} else {
			setCurrentSpeed(wishfulCurrentSpeed);
		}

		return getCurrentSpeed();
	}

}
