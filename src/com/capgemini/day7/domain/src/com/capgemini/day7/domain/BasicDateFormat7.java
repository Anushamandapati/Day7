package com.capgemini.day7.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicDateFormat7
{
	public static String DateFormat7(String str1) throws ParseException
	{
		Date date1 = new SimpleDateFormat("ddMMyyyy").parse(str1);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
		String strDate = formatter.format(date1);
		System.out.println("Date Format with MM/dd/yyyy : " + strDate);
		return strDate;
	}

	public static String DateFormat1(String str2) throws ParseException
	{
		Date date2 = new SimpleDateFormat("ddMMyyyy").parse(str2);
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, YYYY");
		String strDate = formatter.format(date2);
		System.out.println("Date Format with dd MMMM, YYYY : " + strDate);
		return strDate;
		
	}
}
