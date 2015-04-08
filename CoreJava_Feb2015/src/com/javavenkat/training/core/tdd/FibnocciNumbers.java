package com.javavenkat.training.core.tdd;

import java.util.ArrayList;
import java.util.List;

public class FibnocciNumbers {

	public Integer[] generate(int input) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < input; i++) {
			// first 2 numbers in fib series should be 1,1
			if (i == 0 || i == 1) {
				result.add(1);
			} else {
				
				int size = result.size();
				int previousNumber1 = result.get(size-1);
				int previousNumber2 = result.get(size-2);
				
				int sum = previousNumber1+previousNumber2;
				result.add(sum);
			}
		}
		
		System.out.println(result);
		
		return result.toArray(new Integer[0]);
	}

}
