package com.training.java.core.exceptions;

public class ExceptionDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
			String firstName = args[0];
			
			String lastName = args[1];
			
			System.out.println("Hello " + firstName + " " + lastName);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Looks like there are no elements in that array");
		}
		

	}

}
