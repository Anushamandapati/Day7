package com.capgemini.day7.domain;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FileLinecount
{
	 public static int LineCount()
	  {
		 	int count=0;
		 	File file = new File("C:\\Anu\\anufile.txt");
		 	try(BufferedReader br = new BufferedReader(new FileReader(file)))
		 	{
		 		while(br.readLine()!= null)
		 		{
		 			count++;
		 		}
		 		System.out.println(count);
		 		return count;
		 	}
		 	catch(Exception e)
		 	{
		 		e.printStackTrace();
		 	}
			return count;
	  }
}

