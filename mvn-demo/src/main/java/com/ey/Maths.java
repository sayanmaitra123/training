package com.ey;

public class Maths {
	public int sum(int a, int b) {
		return a + b;
	}

	public int div(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.err.println("Error: Division by Zero !!");
			return 0;
		}
	}

}
