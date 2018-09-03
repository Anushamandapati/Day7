package com.capgemini.day7.tests;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.HomeAssignments;

class HomeAssignmentsTest
{
	HomeAssignments allAssignments=new HomeAssignments() ;
	File assignment1=new File("C:\\Anu\\assignment1.txt") ;
	File assignment2=new File("C:\\Anu\\assignment2.txt") ;
	File assignment3=new File("C:\\Anu\\assignment3.txt") ;
	
	@Test
	void testAddAssignment() {
		assertEquals(true, assignment1.exists());
		assertEquals(true, assignment2.exists());
		assertEquals(true, assignment3.exists());
		
		allAssignments.addAssignment(assignment1,LocalDate.of(12,12,12));
		assertEquals(1,HomeAssignments.assignments.size());
		
		allAssignments.addAssignment(assignment2,LocalDate.of(11,12,12));
		assertEquals(2,HomeAssignments.assignments.size());
		
		allAssignments.addAssignment(assignment3,LocalDate.of(10,12,12));
		assertEquals(3,HomeAssignments.assignments.size());
		}
	
	@Test
	void testRemoveAssignment()
	{
		allAssignments.removeAssignment(assignment3);
		assertEquals(2,HomeAssignments.assignments.size());
	}
	
	@Test
	void testGetEarliestAssignment()
	{	
		Entry<File,LocalDate> entryReturned=allAssignments.getEarliestAssignment() ;
		assertEquals(assignment3,entryReturned.getKey());
	}
	
	

}
