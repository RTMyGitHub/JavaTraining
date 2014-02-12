package com.training.java.core.polymorphysm;

public class PoliceCar extends Car {

	void start() {
		System.out.println("I am starting my PoliceCar...I am different!!");
	}

	@Override
	int accelerate(int howMuch) {

		return super.accelerate(getMaximumSpeed());
	}

	public void chase() {
		System.out.println("Policecar is chasing...");
	}

}
