package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;

import junit.framework.TestCase;

public class TestCalci extends TestCase {
	CalciInhe calObj = new CalciInhe();

	protected void setUp() throws Exception {
		CalciInhe calObj = null;
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	/*public void testAddtionSer() {
		// 1.Input
		CalciInput calInput = null; 
		//CalciInput calInput = new CalciInput();
		calInput.setPar1(2.0);
		calInput.setPar2(4.0);
		// 2.Expected Output
		double expResult = 6.0;
		String expResult1 = "addition";
		double expResult2 = calInput.getPar1();
		double expResult3 = calInput.getPar2();
		// 3.Actual Output
		CalciOutput calOutput = new CalciOutput();
		calOutput = calObj.addition(calInput);
		// 4.Asserts
		assertEquals(expResult, calOutput.getResult());
		assertEquals(expResult1,  calOutput.getOperation());
		assertEquals(expResult2,  calOutput.getPar1());
		assertEquals(expResult3,  calOutput.getPar2());
	}
	public void testSubtractionSer() {
		// 1.Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(4.0);
		calInput.setPar2(2.0);
		// 2.Expected Output
		double expResult = 2.0;
		String expResult1 = "Subtraction";
		double expResult2 = calInput.getPar1();
		double expResult3 = calInput.getPar2();
		// 3.Actual Output
		CalciOutput calOutput = new CalciOutput();
		calOutput = calObj.subtraction(calInput);
		// 4.Asserts
		assertEquals(expResult, calOutput.getResult());
		assertEquals(expResult1,  calOutput.getOperation());
		assertEquals(expResult2,  calOutput.getPar1());
		assertEquals(expResult3,  calOutput.getPar2());
	}
	public void testMultiplicationSer() {
		// 1.Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(2.0);
		calInput.setPar2(4.0);
		// 2.Expected Output
		double expResult = 8.0;
		String expResult1 = "multiplication";
		double expResult2 = calInput.getPar1();
		double expResult3 = calInput.getPar2();
		// 3.Actual Output
		CalciOutput calOutput = new CalciOutput();
		calOutput = calObj.multiplication(calInput);
		// 4.Asserts
		assertEquals(expResult, calOutput.getResult());
		assertEquals(expResult1,  calOutput.getOperation());
		assertEquals(expResult2,  calOutput.getPar1());
		assertEquals(expResult3,  calOutput.getPar2());
	}
	public void testDivsionSer() {
		// 1.Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(12.0);
		calInput.setPar2(0.0);
		// 2.Expected Output
		double expResult = 0.0;
		String expResult1 = "division";
		double expResult2 = calInput.getPar1();
		double expResult3 = calInput.getPar2();
		// 3.Actual Output
		CalciOutput calOutput = new CalciOutput();
		calOutput = calObj.division(calInput);
		// 4.Asserts
		assertEquals(expResult, calOutput.getResult());
		assertEquals(expResult1,  calOutput.getOperation());
		assertEquals(expResult2,  calOutput.getPar1());
		assertEquals(expResult3,  calOutput.getPar2());
	}
	public void testSquarerootSer() {
		// 1.Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(25.0);
		// 2.Expected Output
		double expResult = 5.0;
		String expResult1 = "squareroot";
		double expResult2 = calInput.getPar1();
		double expResult3 = calInput.getPar2();
		// 3.Actual Output
		CalciOutput calOutput = new CalciOutput();
		calOutput = calObj.squareroot(calInput);
		// 4.Asserts
		assertEquals(expResult, calOutput.getResult());
		assertEquals(expResult1,  calOutput.getOperation());
		assertEquals(expResult2,  calOutput.getPar1());
		assertEquals(expResult3,  calOutput.getPar2());
	}*/
	public void testDivsionSer() {
		// 1.Input
		CalciInput calInput = new CalciInput();
		calInput.setPar1(12);
		calInput.setPar2(0);
		// 2.Expected Output
		int expResult = 0;
		String expResult1 = "division";
		int expResult2 = calInput.getPar1();
		int expResult3 = calInput.getPar2();
		// 3.Actual Output
		CalciOutput calOutput = new CalciOutput();
		calOutput = calObj.division1(calInput);
		// 4.Asserts
		assertEquals(expResult, calOutput.getResult());
		assertEquals(expResult1, calOutput.getOperation());
		assertEquals(expResult2, calOutput.getPar1());
		assertEquals(expResult3, calOutput.getPar2());
	}
}
