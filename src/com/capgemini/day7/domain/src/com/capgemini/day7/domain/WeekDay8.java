package com.capgemini.day7.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeekDay8
{
	public static String displayWeekDay() 
	{
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE,MMMM dd,YYYY");		
		String strDate = formatter.format(date1);
		System.out.println("Date Format with weekday,MMMM dd,YYYY : " + strDate);
		return strDate;
	}
}
