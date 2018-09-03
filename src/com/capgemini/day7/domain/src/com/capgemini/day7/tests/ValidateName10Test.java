package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.ValidateName10;

class ValidateName10Test 
{
	@Test
	void test() 
	{
		assertEquals(false, ValidateName10.valid("29/02/2011",2));
		assertEquals(true, ValidateName10.valid("29/02/2012",2));
		assertEquals(true, ValidateName10.valid("20/09/2015",2));
	}
}
