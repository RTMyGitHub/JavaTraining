package com.javavenkat.training.java.core.design;

public class CarDemo {

	public static void main(String[] args) {
		
		Car car = new Car("Porsche", "Cayanee", "987654321");
		
		car.start();
		int currentSpeed = car.accelerate(20);
		
		System.out.println("My current speed = " + currentSpeed);
		System.out.println("Seat belt indicator = " + car.isSeatBeltOn());
		
		car.buckleUp();
		
		int newCurrentSpeed = car.accelerate(20);
		System.out.println("My current speed = " + newCurrentSpeed);
		System.out.println("Seat belt indicator = " + car.isSeatBeltOn());
	}

}
