package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;


import junit.framework.TestCase;

public class TestCalci extends TestCase {

	CalciInheritance calciObj = null;
	protected void setUp() throws Exception {
		calciObj = new CalciInheritance();
	}

	protected void tearDown() throws Exception {
		calciObj = null;
	}
	public void testAdditionser() {
		//1.input
		// 1.input
				CalciInput calInput = new CalciInput();
				calInput 
				// 2.Expected Output
				double expectedResult = 3.3;
				String expectedResult1 = "Conversions";
				double expectedResult2 = conversionInpt.getF();
				// 3. Actual Output
				ConversionsOutput conversionOutpt = new ConversionsOutput();
				conversionOutpt = conversionObj.conversioncelsiusFahrenheit(conversionInpt);
				// 4.Asserts
				assertEquals(expectedResult, conversionOutpt.getResult(), 1);

				assertEquals(expectedResult1, conversionOutpt.getOperations());

				assertEquals(expectedResult2, conversionOutpt.getF());
			}
		
	}
	public void testSubtractionser() {
		//1.input
		CalciInput calInput=new CalciInput();
		calInput.parameter1=4.0;
		calInput.parameter2=3.0;
		//2.Expected Output
		double expResult=1.0;
		String expResult1="Subtraction";
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
