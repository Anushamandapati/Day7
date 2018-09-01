package com.capgemini.day7.domain;

import java.time.LocalDate;

public class MagicDate
{
	public String checkIfMagicDate(LocalDate d1)
	{
		int month=(Integer)d1.getMonthValue() ;
		int year=d1.getYear() ;
		int day=d1.getDayOfMonth() ;
		if((day*month)==year)
		{
			return "magic" ;
		}
		return "not magic";
		
	}
}
