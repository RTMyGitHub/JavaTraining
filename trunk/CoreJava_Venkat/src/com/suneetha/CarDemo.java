package com.suneetha;

public class CarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Instantiation
		Car focus = new Car();
		
		focus.vinNumber = "12345";
		
		Car camry = new Car();
		
		focus.start();
		camry.start();
		
		System.out.println("Camry's vin number = " + camry.vinNumber);
		System.out.println("Camry's age = " + camry.age);
		System.out.println("Camry's isRaceCar = " + camry.isRaceCar);
		
		int age = 25;
		
	}

}
