package com.training.java.core.date;

import java.util.Calendar;

public class DateUtil {
	
	public long getDiffInDays(Calendar date1, Calendar date2)
	{
		long date1Millis = date1.getTimeInMillis();
		long date2Millis = date2.getTimeInMillis();
		
		long differenceInMillis = date2Millis - date1Millis;
		long diffInSec = differenceInMillis/1000;
		long diffInMin = diffInSec/60;
		long diffInHours = diffInMin/60;
		long diffInDays = diffInHours/24;
		
		return diffInDays;
	}

}
