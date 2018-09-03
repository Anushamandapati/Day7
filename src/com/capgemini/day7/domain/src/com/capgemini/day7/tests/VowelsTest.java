package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Vowels;

class VowelsTest 
{
	@Test
	void test() 
	{
		File file=new File("C:\\Anu\\a3.txt");
		assertEquals(5,Vowels.countVowels(file));
	}
}
