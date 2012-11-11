package com.suneetha;

/**
 * This example shows how to use Arrays.
 * 
 * @author Hari
 *
 */
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		String[] students = new String[4];
		
		students[0] = "Vasu";
		students[1] = "Suneetha";
		students[2] = "Sirisha";
		students[3] = "Sekhar";
		*/
		
		
		/*
		String[] students = {"Vasu", "Suneetha", "Sirisha", "Sekhar"};

		//Third student from Array
		String thirdStudent = students[2];
		System.out.println("Third student = " + thirdStudent);
		*/
		
		String firstStudent = args[0];
		String secondStudent = args[1];
		String thirdStudent = args[2];
		
		System.out.println("First student = " + firstStudent);
		System.out.println("Second student = " + secondStudent);
		System.out.println("Third student = " + thirdStudent);
		
	}

}
