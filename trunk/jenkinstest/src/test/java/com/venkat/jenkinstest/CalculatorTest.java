package com.venkat.jenkinstest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		
		double result = new Calculator().add(2, 5);
		assertEquals(8, result, 0);
	}
	
	@Test
	public void testDivideRegular() throws Exception {
		
		double result = new Calculator().divide(10, 2, true);
		System.out.println("Result = " + result);
		
	}

}
