package com.javavenkat.training.java.core.inheritance;

public class Cow extends Animal {
	
	public Cow(String name, int age, double height, int numberOfLegs) {
		super(name, age, height, numberOfLegs);
	}

	public void milk()
	{
		System.out.println("Cow is milking");
	}

}
