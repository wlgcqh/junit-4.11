package com.qiheng.junit4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@Test(timeout = 600)
	public void testAdd() {

		int result = calculator.add(2, 3);
		assertEquals(5, result);
	}

	@Test(expected = Exception.class)
	@Ignore
	public void testDiv() throws Exception {
		calculator.div(3, 0);
	}
}
