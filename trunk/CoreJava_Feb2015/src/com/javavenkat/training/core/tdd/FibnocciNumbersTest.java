package com.javavenkat.training.core.tdd;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibnocciNumbersTest {

	private FibnocciNumbers f;

	@Before
	public void setup() {
		f = new FibnocciNumbers();
	}

	@Test
	public void fibnocciShouldWorkForNumbers() {
		Assert.assertArrayEquals(new Integer[] { 1, 1 }, f.generate(2));
		Assert.assertArrayEquals(new Integer[] { 1, 1, 2 }, f.generate(3));
		Assert.assertArrayEquals(new Integer[] { 1, 1, 2, 3 }, f.generate(4));
		Assert.assertArrayEquals(new Integer[] { 1, 1, 2, 3, 5}, f.generate(5));
		Assert.assertArrayEquals(new Integer[] { 1, 1, 2, 3, 5, 8}, f.generate(6));
	}
	
}
