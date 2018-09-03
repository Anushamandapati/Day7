package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.FileOperations;

class FileOperationsTest
{

	@Test
	void testReverse() 
	{
		assertEquals(true, FileOperations.reverse("C:\\Question14\\Text.txt","C:\\Question14\\Revout.txt"));
		assertEquals(true, FileOperations.convert("C:\\Question14\\Text.txt","C:\\Question14\\Conout.txt"));
		assertEquals(true, FileOperations.compare("C:\\Question14\\Text.txt","C:\\Question14\\Wordcount.txt"));
	}
}