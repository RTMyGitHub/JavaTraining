package com.training.java.core.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("D:\\students.txt");

		PrintWriter out = new PrintWriter(fw);

		out.println("Chaitra");
		out.println("Davuluri");
		out.println("Gayathri");
		
		out.close();
	}

}
