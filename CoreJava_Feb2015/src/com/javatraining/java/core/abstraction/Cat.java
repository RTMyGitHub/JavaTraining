package com.javatraining.java.core.abstraction;

public class Cat extends Animal {

	public Cat(String name, int age, double height, int numberOfLegs) {
		super(name, age, height, numberOfLegs);
	}

	@Override
	public void eat() {
		System.out.println("Cat eats cat way");
	}

}
