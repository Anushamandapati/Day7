package com.capgemini.day7.tests;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.MyDate;

class MyDateTest
{
	@Test
	void testMyDate()
	{
		MyDate date1 = new MyDate(LocalDate.of(2018, 03, 28));
		MyDate date2 = new MyDate(LocalDate.of(2017, 01, 18));
		MyDate date3 = new MyDate(LocalDate.of(2016, 03, 27));
	
		
		ArrayList<MyDate> al =new ArrayList<>();
		al.add(date1);
		al.add(date2);
		al.add(date3);
		
		ArrayList<MyDate> result = new ArrayList<>();
		try(FileOutputStream fileOutput = new FileOutputStream("C:\\Anu\\a1.txt"); ObjectOutputStream objectOutput=new ObjectOutputStream(fileOutput))
		{
			objectOutput.writeObject(al);

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		try(FileInputStream fileInput=new FileInputStream("C:\\Anu\\a1.txt");ObjectInputStream objectInput=new ObjectInputStream(fileInput))
		{
			result=(ArrayList<MyDate>)objectInput.readObject();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(result);
	}

}


