package com.javavenkat.training.java.corejava.controlflow;

public class IfElseDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "John";
		int age = 46;
		
		System.out.println("Initial value of name = " + name);
		
		if(age == 21)
		{
			name = "Joe";
		} else if(age > 65)
		{
			name = "Mike";
		}
		
		System.out.println("Name = " + name);
		
		
	}

}
