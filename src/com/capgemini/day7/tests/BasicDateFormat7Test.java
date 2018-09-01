package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.BasicDateFormat7;

class BasicDateFormat7Test 
{
	@Test
	void testDateFormat() throws ParseException {
		
		
		
		 assertEquals("12/12/2010",BasicDateFormat7.DateFormat("12122010"));
		 assertEquals("12 December, 2010",BasicDateFormat7.DateFormat1("12122010"));

}

}
