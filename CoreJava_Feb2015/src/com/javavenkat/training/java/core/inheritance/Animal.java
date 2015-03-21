package com.javavenkat.training.java.core.inheritance;

public class Animal {

	private String name;
	private int age;
	private double height;
	private int numberOfLegs;
	private String color;

	public Animal(String name, int age, double height, int numberOfLegs) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.numberOfLegs = numberOfLegs;
	}

	public void walk() {
		System.out.println(name + " is walking");
	}

	public void eat() {
		System.out.println(name + " is eating");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}
}
