package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;


import org.junit.jupiter.api.Test;

class FileExistsTest
{


	@Test
	void testFile() 
	{
		File  file=new File("C:\\Anu");
		assertEquals(true, file.exists());
	}
}