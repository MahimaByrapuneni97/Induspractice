package com.indus.pratice.service;

import com.indus.pratice.domain.AreaInput;
import com.indus.pratice.domain.AreaOutput;
import com.indus.pratice.service.AreaCdt;

import junit.framework.TestCase;

public class TestAreaCdt extends TestCase {
	AreaCdt areaObj = null;

	protected void setUp() throws Exception {
		areaObj = new AreaCdt();
	}

	protected void tearDown() throws Exception {
		areaObj = null;
	}

	public void testAreaSener() {
		// 1.input
		AreaInput areaInpt = new AreaInput();
		areaInpt.a = 5.0;

		// 2.Expected Output
		double expectedOutput = 25.0;
		String expectedOutput1 = "area";
		double expectedOutput2 = areaInpt.a;
		// 3. Actual Output
		AreaOutput areaOutput = new AreaOutput();
		areaOutput = areaObj.areaSquare(areaInpt);

		// 4.Asserts
		assertEquals(expectedOutput, areaOutput.result);
		assertEquals(expectedOutput1, areaOutput.operation);
		assertEquals(expectedOutput2, areaInpt.a);
	}

	public void testAreaSener1() {
		// 1.input
		AreaInput areaInpt = new AreaInput();
		areaInpt.b = 5.0;
		areaInpt.h = 6.0;

		// 2.Expected Output
		double expectedOutput = 15.0;
		String expectedOutput1 = "area";
		double expectedOutput2 = areaInpt.b;
		double expectedOutput3 = areaInpt.h;
		// 3. Actual Output
		AreaOutput areaOutput = new AreaOutput();
		areaOutput = areaObj.areaRectangle(areaInpt);

		// 4.Asserts
		assertEquals(expectedOutput, areaOutput.result);
		assertEquals(expectedOutput1, areaOutput.operation);
		assertEquals(expectedOutput2, areaInpt.b);
		assertEquals(expectedOutput3, areaInpt.h);
	}
	public void testAreaSener2() {
		// 1.input
		AreaInput areaInpt = new AreaInput();
		areaInpt.l = 5.0;
		areaInpt.w = 4.0;

		// 2.Expected Output
		double expectedOutput = 20.0;
		String expectedOutput1 = "area";
		double expectedOutput2 = areaInpt.l;
		double expectedOutput3 = areaInpt.w;
		// 3. Actual Output
		AreaOutput areaOutput = new AreaOutput();
		areaOutput = areaObj.areaTriangle(areaInpt);

		// 4.Asserts
		assertEquals(expectedOutput, areaOutput.result);
		assertEquals(expectedOutput1, areaOutput.operation);
		assertEquals(expectedOutput2, areaInpt.l);
		assertEquals(expectedOutput3, areaInpt.w);
	}
	public void testAreaSener3() {
		// 1.input
		AreaInput areaInpt = new AreaInput();
		areaInpt.r = 5.0;
		

		// 2.Expected Output
		double expectedOutput = 78.5;
		String expectedOutput1 = "area";
		double expectedOutput2 = areaInpt.r;
		// 3. Actual Output
		AreaOutput areaOutput = new AreaOutput();
		areaOutput = areaObj.areaCircle(areaInpt);

		// 4.Asserts
		assertEquals(expectedOutput, areaOutput.result,1);
		assertEquals(expectedOutput1, areaOutput.operation);
		assertEquals(expectedOutput2, areaInpt.r);
		
	}
}
