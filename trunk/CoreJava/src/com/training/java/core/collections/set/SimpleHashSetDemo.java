package com.training.java.core.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SimpleHashSetDemo {

	public static void main(String[] args) {

		Set<String> states = new HashSet<String>();

		states.add("TX");
		states.add("OH");
		states.add("MI");
		states.add("MI");
		states.add("AB");
		states.add("CO");

		// Observe the output carefully..The order is neither sorted not the
		// order you added to the Set. It is completely random. Also, keep in
		// mind that there is no guarantee that it gets printed in the same
		// order you run every time. You cannot depend on the order at all. But,
		// this is quicker than all other set types, so if you need a simple, no
		// order Set with better performance, HashSet is your bet.

		for (String aState : states) {
			System.out.println("aState = " + aState);
		}
	}
}
