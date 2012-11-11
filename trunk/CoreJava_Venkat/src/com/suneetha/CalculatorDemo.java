package com.suneetha;

public class CalculatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		String firstNumber = args[0];
		String secondNumber = args[1];
		
		int fn = Integer.parseInt(firstNumber);
		int sn = Integer.parseInt(secondNumber);
		
		int result = calc.add(fn, sn);
		
		System.out.println("Result = " + result);
	}

}
