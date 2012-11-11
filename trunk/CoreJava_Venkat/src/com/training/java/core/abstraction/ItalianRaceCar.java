package com.training.java.core.abstraction;

public class ItalianRaceCar extends RaceCar {

	@Override
	public void accelerate(int increaseMiles) {
		currentSpeed = currentSpeed + (10*increaseMiles);
	}
	
	

}
