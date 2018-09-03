package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.WeekDay8;

class WeekDay8Test
{
	@Test
	void testWeekDay() 
	{
		assertEquals("Monday,September 03,2018",WeekDay8.displayWeekDay());
			 
	}
}
