package com.capgemini.day7.tests;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.MyDate5;

class MyDate5Test
{
	@Test
	void testMyDate()
	{
		MyDate5 date1 = new MyDate5(LocalDate.of(2018, 03, 28));
		MyDate5 date2 = new MyDate5(LocalDate.of(2017, 01, 18));
		MyDate5 date3 = new MyDate5(LocalDate.of(2016, 03, 27));
	
		
		ArrayList<MyDate5> al =new ArrayList<>();
		al.add(date1);
		al.add(date2);
		al.add(date3);
		
		ArrayList<MyDate5> result = new ArrayList<>();
		try(FileOutputStream fileOutput = new FileOutputStream("C:\\Anu\\a2.txt"); ObjectOutputStream objectOutput=new ObjectOutputStream(fileOutput))
		{
			objectOutput.writeObject(al);

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		try(FileInputStream fileInput=new FileInputStream("C:\\Anu\\a2.txt"); ObjectInputStream objectInput=new ObjectInputStream(fileInput))
		{
			result=(ArrayList<MyDate5>)objectInput.readObject();
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


