package com.training.java.core.polymorphysm;

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

	void start() {
		System.out.println("I am starting my RaceCar...rumm..!!");
	}

	int accelerate(int howMuch) {

		return super.accelerate(howMuch + 50);
	}

}
