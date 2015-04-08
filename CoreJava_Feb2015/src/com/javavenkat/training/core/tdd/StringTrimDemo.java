package com.javavenkat.training.core.tdd;

public class StringTrimDemo {

	public static void main(String[] args) {
		
		String str = "       65       ";
		
		System.out.println("str = -->" + str.trim() + "<--");
		str = str.trim();
		
		System.out.println("Length = " + str.length());
		
		System.out.println(str.isEmpty());

	}

}
