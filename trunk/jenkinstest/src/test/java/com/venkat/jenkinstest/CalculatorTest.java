package com.venkat.jenkinstest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		
		double result = new Calculator().add(2, 5);
		assertEquals(7.0, result, 0);
		
	}

}
