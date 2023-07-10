package com.indus.pratice.service;

import com.indus.pratice.domain.PerimeterInput;
import com.indus.pratice.domain.PerimeterOutput;
import com.indus.pratice.service.Perimeter;

import junit.framework.TestCase;

public class TestPerimeter extends TestCase {

	Perimeter perimeterObj = null;

	protected void setUp() throws Exception {
		perimeterObj = new Perimeter();
	}

	protected void tearDown() throws Exception {
		perimeterObj = null;
	}

	public void testperimeterSener() {
		// 1.input
		PerimeterInput perimeterInpt = new PerimeterInput();
		perimeterInpt.setArea(5.0);

		// 2.Expected Output
		double expectedOutput = 20.0;
		String expectedOutput1 = "perimeter";
		double expectedOutput2 = perimeterInpt.getArea();
		// 3. Actual Output
		PerimeterOutput perimeterOutput = new PerimeterOutput();
		perimeterOutput = perimeterObj.perimeterSquare(perimeterInpt);

		// 4.Asserts
		assertEquals(expectedOutput, perimeterOutput.getResult());
		assertEquals(expectedOutput1, perimeterOutput.getOperations());
		assertEquals(expectedOutput2, perimeterInpt.getArea());

	}
}
