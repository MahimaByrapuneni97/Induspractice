package com.indus.pratice.basics;

import junit.framework.TestCase;

public class TestDivision extends TestCase {

	Calc calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calc();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testSubtractionSer1() {
		// 1.input
		double par1 = 20.0;
		double par2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 10.0;
		// 3.Actual Output
		double actualOutput = calObj.subtraction(par1, par2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}

	public void testSubtractionSer2() {
		// 1.input
		double par1 = 205.0;
		double par2 = 10.0;
		// 2.Expected Output
		double expectedOutput = 195.0;
		// 3.Actual Output
		double actualOutput = calObj.subtraction(par1, par2);
		// 4.Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}

}