package com.training.java.core.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileWriter fw = null;
		PrintWriter out = null;
		try {
			fw = new FileWriter("D:\\students.txt");
			
			out = new PrintWriter(fw);

			out.println("Chaitra");
			out.println("Davuluri");
			out.println("Gayathri");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			if(out != null)
			{
				out.close();
			}
		}

		System.out.println("I am after catch block");

	}

}
