package com.indus.pratice.basics;

import junit.framework.TestCase;

public class TestSquareRoot extends TestCase {
	Calc calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calc();

	}

	protected void tearDown() throws Exception {
		calObj = null;

	}

	public void testsquareRootSer1() {
		// 1.input
		double parameter = 4.0;
		// 2.Expected Output
		double expectedOutput = 2.0;
		// 3.Actual Output
		double actualOutput = calObj.squareRoot(parameter);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}

	public void testMultiplicationSer2() {
		// 1.input
		double parameter = 25.0;
		// 2.Expected Output
		double expectedOutput = 5.0;
		// 3.Actual Output
		double actualOutput = calObj.squareRoot(parameter);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}


}
