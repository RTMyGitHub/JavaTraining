package com.training.spring;

public class TravellerDemo {

	public static void main(String[] args) {
		
		Vehicle v = new Truck();
		
		Traveller shovan = new Traveller(v);
		shovan.travel();
		
		Traveller2 anteneh = new Traveller2();
		anteneh.setVehicle(v);
		
		anteneh.travel();
	}

}
