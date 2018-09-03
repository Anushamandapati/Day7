package com.capgemini.day7.tests;




import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.DateFormat12;

class DateFormat12Test
{
	@Test
	void test()
	{
		assertEquals(true, DateFormat12.checkMagic(2,2,04));
		assertEquals(false, DateFormat12.checkMagic(2,2,14));
	}
}
