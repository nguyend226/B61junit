package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculationTest {
	Calculation c = new Calculation();
	
	@Test
	public void test1() {
		assertEquals(c.add(10, 20), 30);
	}
	
	@Test
	public void test2() {
		assertEquals(c.add(10, 20), 10);
	}
	
}
