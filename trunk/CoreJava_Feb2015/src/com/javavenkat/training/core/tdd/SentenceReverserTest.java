package com.javavenkat.training.core.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SentenceReverserTest {

	private SentenceReverser reverser;

	@Before
	public void setup() {
		reverser = new SentenceReverser();
	}

	@Test
	public void oneWordInputShouldReturnTheSameWord() throws BadInputException {
		String output = reverser.reverse("Hello");
		Assert.assertEquals("Hello", output);
	}

	@Test
	public void sentenceWithTwoWordsShouldBeReversed() throws BadInputException {
		String output = reverser.reverse("Hello World");
		Assert.assertEquals("World Hello", output);
	}

	@Test
	public void sentenceWithMoreThanTwoWordsShouldBeReversed()
			throws BadInputException {
		String output = reverser.reverse("How are you doing");
		Assert.assertEquals("doing you are How", output);
	}

	@Test(expected = BadInputException.class)
	public void nullInputShouldThrowException() throws BadInputException {
		reverser.reverse(null);
	}

	@Test(expected = BadInputException.class)
	public void emptyInputShouldThrowException() throws BadInputException {
		reverser.reverse("  ");
	}

}
