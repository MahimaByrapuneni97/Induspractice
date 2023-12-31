package com.indus.pratice.basics;

import junit.framework.TestCase;

public class TestModulo extends TestCase {

	Calc calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calc();

	}

	protected void tearDown() throws Exception {
		calObj = null;

	}

	public void testModuloSer1() {
		// 1.input
		double parameter1 = 20.0;
		double parameter2 = 5.0;
		// 2.Expected Output
		double expectedOutput = 0.0;
		// 3.Actual Output
		double actualOutput = calObj.modulo(parameter1, parameter2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}

	public void testModuloSer2() {
		// 1.input
		double parameter1 = 20.0;
		double parameter2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 0.0;
		// 3.Actual Output
		double actualOutput = calObj.modulo(parameter1, parameter2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
		
	}

}
