package com.training.java.core.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
	
	public static void main(String[] args) throws ParseException {
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy/HH-mm-ss a");
		String nowInString = sdf.format(now);
		
		//Date jan1st = sdf.parse("01-01-2015");
		
		//System.out.println(jan1st);
		
		//System.out.println(now);
		System.out.println(nowInString);
	}

}
