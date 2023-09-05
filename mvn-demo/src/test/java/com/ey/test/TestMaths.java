package com.ey.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ey.Maths;

public class TestMaths {
	private static Maths mat;

	@BeforeAll
	public static void init() {
		// TODO Auto-generated method stub
		mat = new Maths();

	}

	@Test
	public void testSum() {
		// TODO Auto-generated method stub
		assertEquals(20, mat.sum(10, 10));

	}

	@Test
	public void testDiv() {
		// TODO Auto-generated method stub
		assertEquals(5, mat.div(10, 2));

	}

}
