package com.training.java.core.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDemo3 {

	public static void main(String[] args) {
		
		Calendar jan1_2015 = new GregorianCalendar(2015, 0, 1);
		Calendar jan14_2015 = new GregorianCalendar(2015, 0, 14);
		
		//jan1_2015.add(Calendar.MONTH, 1);
		
		System.out.println("date1 = " + jan1_2015.getTime());
		System.out.println("date2 = " + jan14_2015.getTime());
		
		long date1Millis = jan1_2015.getTimeInMillis();
		long date2Millis = jan14_2015.getTimeInMillis();
		
		long differenceInMillis = date2Millis - date1Millis;
		long diffInSec = differenceInMillis/1000;
		long diffInMin = diffInSec/60;
		long diffInHours = diffInMin/60;
		long diffInDays = diffInHours/24;
		
		System.out.println("Diff in days = " + diffInDays);
		
		
		System.out.println(jan1_2015.before(jan14_2015));

	}

}
