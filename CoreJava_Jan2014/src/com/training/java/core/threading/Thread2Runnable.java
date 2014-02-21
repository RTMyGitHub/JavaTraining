package com.training.java.core.threading;

public class Thread2Runnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			System.out.println("In.." + Thread.currentThread().getName()
					+ "i = " + i);
		}
	}

}
