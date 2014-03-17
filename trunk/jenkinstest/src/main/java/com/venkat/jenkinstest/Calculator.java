package com.venkat.jenkinstest;

public class Calculator {

	public double add(double one, double two) {
		return one + two;
	}

	public double subtract(double one, double two) {
		return one - two;
	}

	public double divide(double one, double two, boolean reverse) {
		if (reverse) {
			return one / two;
		} else {
			return two / one;
		}
	}

}
