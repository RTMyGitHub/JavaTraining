package com.training.java.core.thread;

public class ConsolePrinter extends Thread {

	private String printerName;
	private String printerCompany;

	public void print() {
		new Thread(this).start();
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName() + "<--> i = "
					+ i);
		}
	}

}
