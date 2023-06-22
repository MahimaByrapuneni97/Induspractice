package com.indus.pratice.basics;

import junit.framework.TestCase;

public class TestSubtraction extends TestCase {

	Calc calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calc();

	}

	protected void tearDown() throws Exception {
		calObj = null;

	}

	public void testSubtractionSer1() {
		// 1.input
		double parameter1 = 20.0;
		double parameter2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 10.0;
		// 3.Actual Output
		double actualOutput = calObj.subtraction(parameter1, parameter2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}

	public void testSubtractionSer2() {
		// 1.input
		double parameter1 = 20.0;
		double parameter2 = 1.0;
		// 2.Expected Output
		double expectedOutput = 19.0;
		// 3.Actual Output
		double actualOutput = calObj.subtraction(parameter1, parameter2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}
}
