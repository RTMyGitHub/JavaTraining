package com.javavenkat.training.java.corejava.controlflow;
public class IfElseDemo {

	public static void main(String[] args) {

		int age = 21;
		boolean male = false;

		if (age >= 21) {
			System.out.println("he/she can drink");
		} else if (male && age >= 20) {
			System.out.println("males with the age 20 or more can be sold");
		} else {
			System.out.println("he/she can't buy a drink");
		}

	}
}
