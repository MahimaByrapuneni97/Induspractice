package com.indus.pratice.service;

import com.indus.pratice.domain.AreaInput;
import com.indus.pratice.domain.AreaOutput;
import com.indus.pratice.service.Area;

import junit.framework.TestCase;

public class TestArea extends TestCase {

	Area areaObj = null;

	protected void setUp() throws Exception {
		areaObj = new Area();
	}

	protected void tearDown() throws Exception {
		areaObj = null;
	}

	public void testAreaSener() {
		// 1.input
		AreaInput areaInpt = new AreaInput();
		areaInpt.setArea(5.0);

		// 2.Expected Output
		double expectedOutput = 25.0;
		String expectedOutput1 = "area";
		double expectedOutput2 = areaInpt.getArea();
		// 3. Actual Output
		AreaOutput areaOutput = new AreaOutput();
		areaOutput = areaObj.areaSquare(areaInpt);

		// 4.Asserts
		assertEquals(expectedOutput, areaOutput.getResult());
		assertEquals(expectedOutput1, areaOutput.getOperation());
		assertEquals(expectedOutput2, areaInpt.getArea());
	}

}
