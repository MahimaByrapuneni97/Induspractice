package com.indus.pratice.service;

import com.indus.pratice.domain.AreaInput;
import com.indus.pratice.domain.AreaOutput;
import com.indus.pratice.domain.PermiterInput;
import com.indus.pratice.domain.permiterOutput;
import com.indus.pratice.service.PermiterCdt;

import junit.framework.TestCase;

public class TestPermiter extends TestCase {
	PermiterCdt perimeterObj = null;

	protected void setUp() throws Exception {
		perimeterObj = new PermiterCdt();
	}

	protected void tearDown() throws Exception {
		perimeterObj = null;
	}

	public void testperimeterSener() {
		// 1.input
		PermiterInput perimeterInpt = new PermiterInput();
		perimeterInpt.area = 5.0;

		// 2.Expected Output
		double expectedOutput = 20.0;
		String expectedOutput1 = "perimeter";
		double expectedOutput2 = perimeterInpt.area;
		// 3. Actual Output
		permiterOutput perimeterOutput = new permiterOutput();
		perimeterOutput = perimeterObj.perimeterSquare(perimeterInpt);

		// 4.Asserts
		assertEquals(expectedOutput, perimeterOutput.result);
		assertEquals(expectedOutput1, perimeterOutput.Operations);
		assertEquals(expectedOutput2, perimeterInpt.area);

}
	public void testperimeterSener1() {
		// 1.input
		PermiterInput perimeterInpt = new PermiterInput();
		perimeterInpt.s = 5.0;
		perimeterInpt.b = 4.0;

		// 2.Expected Output
		double expectedOutput = 14.0;
		String expectedOutput1 = "perimeter";
		double expectedOutput2 = perimeterInpt.b;
		double expectedOutput3 = perimeterInpt.s;
		// 3. Actual Output
		permiterOutput perimeterOutput = new permiterOutput();
		perimeterOutput = perimeterObj.perimeterTringle(perimeterInpt);

		// 4.Asserts
		assertEquals(expectedOutput, perimeterOutput.result);
		assertEquals(expectedOutput1, perimeterOutput.Operations);
		assertEquals(expectedOutput2, perimeterInpt.b);
		assertEquals(expectedOutput3, perimeterInpt.s);
	}
	public void testperimeterSener2() {
		// 1.input
		PermiterInput perimeterInpt = new PermiterInput();
		perimeterInpt.l = 5.0;
		perimeterInpt.w = 4.0;

		// 2.Expected Output
		double expectedOutput = 18.0;
		String expectedOutput1 = "perimeter";
		double expectedOutput2 = perimeterInpt.l;
		double expectedOutput3 = perimeterInpt.w;
		// 3. Actual Output
		permiterOutput perimeterOutput = new permiterOutput();
		perimeterOutput = perimeterObj.perimeterRectangle(perimeterInpt);

		// 4.Asserts
		assertEquals(expectedOutput, perimeterOutput.result);
		assertEquals(expectedOutput1, perimeterOutput.Operations);
		assertEquals(expectedOutput2, perimeterInpt.l);
		assertEquals(expectedOutput3, perimeterInpt.w);
	}
	public void testperimeterSener3() {
		// 1.input
		PermiterInput perimeterInpt = new PermiterInput();
		perimeterInpt.r = 5.0;

		// 2.Expected Output
		double expectedOutput = 31.4;
		String expectedOutput1 = "perimeter";
		double expectedOutput2 = perimeterInpt.r;
		// 3. Actual Output
		permiterOutput perimeterOutput = new permiterOutput();
		perimeterOutput = perimeterObj.perimeterCricle(perimeterInpt);

		// 4.Asserts
		assertEquals(expectedOutput, perimeterOutput.result,1);
		assertEquals(expectedOutput1, perimeterOutput.Operations);
		assertEquals(expectedOutput2, perimeterInpt.r);
	}
}
