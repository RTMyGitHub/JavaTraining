package com.javavenkat.training.core.tdd;

public class SentenceReverser {

	public String reverse(String input) throws BadInputException {

		if (input == null) {
			throw new BadInputException("Null input is not allowed");
		} else if (input.trim().isEmpty()) {
			throw new BadInputException("Empty input is not allowed");
		}

		String[] words = input.split(" ");

		if (words.length == 1) {
			return input;
		} else {

			return reverse(words);
		}
	}

	private String reverse(String[] words) {
		StringBuilder reversedString = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			String word = words[i];

			reversedString.append(word);

			if (i != 0) {
				reversedString.append(" ");
			}
		}

		return reversedString.toString();
	}
}
