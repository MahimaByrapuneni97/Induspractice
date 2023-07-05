package com.indus.pratice.bascis;

import com.indus.pratice.basics.Conversions;
import com.indus.pratice.domain.ConversionsInput;
import com.indus.pratice.domain.ConversionsOutput;

import junit.framework.TestCase;

public class TestConversions extends TestCase {

	Conversions conversionObj = null;

	protected void setUp() throws Exception {
		conversionObj = new Conversions();
	}

	protected void tearDown() throws Exception {
		conversionObj = null;
	}

	public void testConversionCelsiusFahrenheitSer() {
		// 1.input
		ConversionsInput conversionInpt = new ConversionsInput();
		conversionInpt.setF(38.0);
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
