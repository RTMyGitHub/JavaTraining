package com.training.java.core.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo2 {

	public static void main(String[] args) {
		
		Calendar now = new GregorianCalendar();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int minutes = now.get(Calendar.MINUTE);
		
		System.out.println("hours = " + minutes);
		System.out.println("minutes = " + minutes);
		
		System.out.println("year = " + year);
		System.out.println("month = " + month);
		
		Date nowDate = now.getTime();
		
		System.out.println("Date = " + nowDate);
	}

}
