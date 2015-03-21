package com.javavenkat.training.java.corejava.constructor;

public class CarDemo {
	
	int numberOfCars;
	
	public static void main(String[] args) {
		
		Car c = new Car("123456", "BMW", "X3");
		
		c.start();
		
		c.accelerate(20);
		c.accelerate(50);
		c.accelerate(50);
		c.accelerate(50);
		c.accelerate(510);
		
		System.out.println("I am " + c.getVin() + " now driving at " + c.getCurrentSpeed());
	}
	
	public void increaseCount()
	{
		this.numberOfCars ++;
	}

}
