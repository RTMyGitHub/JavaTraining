package com.training.java.core.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SimpleTreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> states = new TreeSet<String>();

		states.add("TX");
		states.add("OH");
		states.add("MI");
		states.add("MI");
		states.add("AB");
		states.add("CO");

		// Observe the output carefully. In the case of TreeSet, it prints in
		// the natural order of values. For Strings, the order is alphabetical,
		// for numbers it is natural number order.

		for (String aState : states) {
			System.out.println("aState = " + aState);
		}
	}

}
