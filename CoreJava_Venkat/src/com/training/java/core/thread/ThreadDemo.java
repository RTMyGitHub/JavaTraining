package com.training.java.core.thread;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConsolePrinter printer = new ConsolePrinter();
		
		System.out.println("1st print is going to start");
		printer.print();
		System.out.println("1st print is done");
	}

}
