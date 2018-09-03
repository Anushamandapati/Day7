package com.capgemini.day7.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class MyDate5 implements Serializable
{
	private LocalDate date;
	public LocalDate getDate() 
	{
		return date;
	}
	public void setDate(LocalDate date)
	{
		this.date = date;
	}
	public MyDate5()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MyDate5(LocalDate date)
	{
		super();
		this.date = date;
	}
	@Override
	public String toString()
	{
		return "MyDate [date=" + date + "]";
	}
}
