package com.wipro.task;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DailyTasksTest {
	@Test
	public void addery() {
		DailyTasks d=new DailyTasks();
		String result=d.StringConcat("chan", "gow");
		assertEquals("changow", result);
		System.out.println(result);
		
	}
	@After
	public void presence() {
		DailyTasks d=new DailyTasks();
		boolean result=d.checkPresence("chan", "chan");
		assertTrue(result);
		System.out.println(result);
	}
	@Before
	public void Array1() {
		DailyTasks d=new DailyTasks();
		int[] actual= {11,22,33};
		int[] result= {11,22,33};
		assertArrayEquals(actual, result);
		for(int i=0;i<actual.length;i++) {
		System.out.println(actual[i]+" "+result[i]);
	}
	}
}
