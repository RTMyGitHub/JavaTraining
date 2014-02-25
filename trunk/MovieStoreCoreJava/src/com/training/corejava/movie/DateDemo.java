package com.training.corejava.movie;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2014, Calendar.APRIL, 30);
		
		Date apr30 = cal.getTime();
		
		System.out.println(apr30.after(now));
		
		System.out.println("Now = " + now);
	}

}
