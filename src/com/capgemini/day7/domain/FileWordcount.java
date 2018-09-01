package com.capgemini.day7.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordcount
{
	public static int Wordcount()
	{
		int count=0;
		File file = new File("C:\\Anu\\anufile.txt");
		try (Scanner sc = new Scanner(new FileInputStream(file))) 
		{
			while (sc.hasNext()) 
			{
				sc.next();
				count++;
			}
			return count;
		} 
		catch (FileNotFoundException e)
		{
				System.out.println("FileNotFoundException");
		}
		return -1;
	
		
	}
}
