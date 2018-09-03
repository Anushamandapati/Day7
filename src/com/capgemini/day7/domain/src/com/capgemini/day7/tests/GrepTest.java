package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Grep;

class GrepTest
{
	@Test
	void test() throws IOException
	{
		File file = new File("C:\\Anu\\a1.txt");
		assertEquals("true",Grep.stringSearch(file,"anu"));
	}

}
