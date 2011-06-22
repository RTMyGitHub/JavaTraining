package com.training.java.core.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<String> states = new TreeSet<String>();

		states.add("TX");
		states.add("OH");
		states.add("MI");
		states.add("MI");
		states.add("AB");

		// Observe the output carefully..When you use TreeSet, the set is
		// getting sorted. But, in the case of HashSet, the order is not
		// guaranteed.
		// This class implements the Set interface, backed by a hash table
		// (actually a HashMap instance). It makes no guarantees as to the
		// iteration order of the set; in particular, it does not guarantee that
		// the order will remain constant over time. This class permits the null
		// element.

		// This class offers constant time performance for the basic operations
		// (add, remove, contains and size), assuming the hash function
		// disperses the elements properly among the buckets. Iterating over
		// this set requires time proportional to the sum of the HashSet
		// instance's size (the number of elements) plus the "capacity" of the
		// backing HashMap instance (the number of buckets). Thus, it's very
		// important not to set the initial capacity too high (or the load
		// factor too low) if iteration performance is important.
		for (String aState : states) {
			System.out.println("aState = " + aState);
		}
	}

}
