package com.training.java.core.overriding;

/**
 * @author Venkata
 *
 */
public class PoliceCar extends Car {

	/* (non-Javadoc)
	 * @see com.training.java.core.overriding.Car#start()
	 */
	@Override
	void start() {

		super.accelerate(20);

		System.out.println("I am starting my PoliceCar...I am different!!");
	}

	@Override
	int accelerate(int howMuch) {
		return 1;
	}

}
