package com.qiheng.junit4;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParametersTest {
	private Calculator cal = new Calculator();
	private int excepted;
	private int input1;
	private int input2;

	public ParametersTest(int excepted, int input1, int input2) {
		super();
		this.excepted = excepted;
		this.input1 = input1;
		this.input2 = input2;
	}

	@Parameters
	public static Collection prepared() {
		Object[][] obj = { { 3, 2, 1 }, { 0, 4, -4 }, { 12, 4, 8 } };
		return Arrays.asList(obj);
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(this.excepted, cal.add(this.input1, this.input2));
	}
}
