package com.javavenkat.training.java.corejava.controlflow;

import com.javavenkat.training.java.corejava.loops.WhileDemo;

public class IfElseDemo4 {

	public static void main(String[] args) {

		String sex = "male";

		int age = 20;

		if (age >= 21 || (age == 20 && sex.equals("male"))) {
			System.out.println(" you can buy the drink");
		} else {
			System.out.println(" you can not buy the drink");
		}
		
		WhileDemo whileDemo = new WhileDemo();
		
		
		
		
	}
}
