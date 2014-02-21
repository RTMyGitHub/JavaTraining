package com.training.java.core.threading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("In.." + Thread.currentThread().getName());
		
		new Thread(new Thread2Runnable()).start();
		
		System.out.println("Before main thread sleeps");
		Thread.sleep(1000);
		System.out.println("After main thread sleeps");
		
		for(int j=0; j<1000; j++)
		{
			System.out.println("In.." + Thread.currentThread().getName() + "j = " + j);
		}
	}

}
