package com.jenkinDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWorking {

	Working w1=new Working();
	
	@Test
	public void testAddToLog1() {
		assertEquals("Added Log for Remo", w1.addToLog("Remo"));
	}
	
	@Test
	public void testAddToLog2() {
		assertEquals("Added Log for Vino", w1.addToLog("Vino"));
	}
	
	@Test
	public void testAddToLog3() {
		assertEquals("Added Log for Vinolisha", w1.addToLog("Vinolisha"));
	}
	
	@Test
	public void testAddToLog4() {
		assertEquals("Added Log for Vinisha", w1.addToLog("Vinisha"));
	}
	
	
	
}
