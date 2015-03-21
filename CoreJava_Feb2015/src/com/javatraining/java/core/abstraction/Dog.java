package com.javatraining.java.core.abstraction;

public class Dog extends Animal {
	
	public Dog(String name, int age, double height, int numberOfLegs) {
		super(name, age, height, numberOfLegs);
	}

	@Override
	public void eat() {
		System.out.println("Dog eats dog way");
	}

}
