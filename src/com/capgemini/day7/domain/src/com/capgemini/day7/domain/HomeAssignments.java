package com.capgemini.day7.domain;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HomeAssignments 
{
	public static LinkedHashMap<File, LocalDate> assignments = new LinkedHashMap<>();

	public void addAssignment(File location, LocalDate date) 
	{
		assignments.put(location, date);
	}

	public void removeAssignment(File location)
	{
		assignments.remove(location);
	}

	public LinkedHashMap<File, LocalDate> getAssignments() 
	{
		return assignments;
	}

	
	public Entry<File, LocalDate> getEarliestAssignment()
	{
		LocalDate earliestDate = assignments.entrySet().iterator().next().getValue();
		Entry<File, LocalDate> earliestAssignment = null;
		LocalDate tempDate;

		for (Entry<File, LocalDate> entry : assignments.entrySet())
		{
			tempDate = entry.getValue();

			if (tempDate.compareTo(earliestDate) < 0)
			{
				earliestAssignment = entry;
			}

		}

		return earliestAssignment;
	}


}
