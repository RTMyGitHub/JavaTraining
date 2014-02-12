package com.training.java.core.abstraction;

public class PoliceCar extends Car {

	void start() {
		System.out.println("I am starting my PoliceCar...I am different!!");
	}

	@Override
	public int accelerate(int howMuch) {

		int wishfulCurrentSpeed = getCurrentSpeed() + howMuch;

		if (wishfulCurrentSpeed > getMaximumSpeed()) {
			setCurrentSpeed(getMaximumSpeed());
		} else {
			setCurrentSpeed(wishfulCurrentSpeed);
		}

		return getCurrentSpeed();
	}

	public void chase() {
		System.out.println("Policecar is chasing...");
	}

}
