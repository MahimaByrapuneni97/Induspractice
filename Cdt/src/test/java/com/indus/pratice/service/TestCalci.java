package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;
import com.indus.pratice.service.Calci;

import junit.framework.TestCase;

public class TestCalci extends TestCase {
Calci calciObj = null;
	protected void setUp() throws Exception {
		calciObj = new Calci();
	}

	protected void tearDown() throws Exception {
		calciObj = null;
	}
	public void testAdditionser() {
		//1.input
		CalciInput calInput=new CalciInput();
		calInput.parameter1=4.0;
		calInput.parameter2=3.0;
		//2.Expected Output
		double expResult=7.0;
		String expResult1="addition";
	double expResult2 = calInput.parameter1;
	double expResult3 = calInput.parameter2;
		
		//3. Actual Output
		CalciOutput calOutput = new CalciOutput();
		calOutput = calciObj.addition(calInput);
		
		/**4. Asserts
		/assertEquals(expResult, calOutput.result);
		assertEquals(expResult1, calOutput.operation);
		assertEquals(expResult2, calOutput.parameter1);
		assertEquals(expResult3, calOutput.parameter2);*/
		assertEquals(expResult1, calOutput);
		
	}
}
