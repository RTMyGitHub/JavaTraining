package com.javavenkat.training.java.core.inheritance;

public class Dog extends Animal {

	private String breed;

	public Dog(String name, int age, double height, int numberOfLegs,
			String breed) {
		super(name, age, height, numberOfLegs);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eats differntly..so I am overriding");
	}
	
	@Override
	public void walk(){
		System.out.println("Dog walks differently..");
	}

}
