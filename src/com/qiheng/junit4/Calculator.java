package com.qiheng.junit4;

public class Calculator {
	public int add(int a, int b) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("除数不能为零！");
		}
		return a / b;
	}
}
