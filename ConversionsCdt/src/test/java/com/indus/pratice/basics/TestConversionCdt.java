package com.indus.pratice.basics;

import com.indus.pratice.domain.ConversionInput;
import com.indus.pratice.domain.ConversionsOutput;

import junit.framework.TestCase;

public class TestConversionCdt extends TestCase {
	ConvesionsCdt conversionObj = null;

	protected void setUp() throws Exception {
		conversionObj = new ConvesionsCdt();
	}

	protected void tearDown() throws Exception {
		conversionObj = null;
	}

	public void testConversionCelsiusFahrenheitSer() {
		// 1.input
		ConversionInput conversionInpt = new ConversionInput();
		conversionInpt.f = 38.0;
		// 2.Expected Output
		double expectedResult = 3.3;
		String expectedResult1 = "Conversion";
		double expectedResult2 = conversionInpt.f;
		// 3. Actual Output
		ConversionsOutput conversionOutpt = new ConversionsOutput();
		conversionOutpt = conversionObj.conversioncelsiusFahrenheit(conversionInpt);
		// 4.Asserts
		assertEquals(expectedResult, conversionOutpt.result, 1);

		assertEquals(expectedResult1, conversionOutpt.operations);

		assertEquals(expectedResult2, conversionOutpt.f);
	}

	public void testConversionPoundsKiloGramsSer() {
		// 1.input
		ConversionInput conversionInpt = new ConversionInput();
		conversionInpt.p = 50.0;
		// 2.Expected Output
		double expectedResult = 110.0;
		String expectedResult1 = "Conversion";
		double expectedResult2 = conversionInpt.p;
		// 3. Actual Output
		ConversionsOutput conversionOutpt = new ConversionsOutput();
		conversionOutpt = conversionObj.conversioncelsiusFahrenheit(conversionInpt);
		// 4.Asserts
		assertEquals(expectedResult, conversionOutpt.result, 0);

		assertEquals(expectedResult1, conversionOutpt.operations);

		assertEquals(expectedResult2, conversionOutpt.p);
	}

	public void testConversionMilesKiloMetersSer() {
		// 1.input
		ConversionInput conversionInpt = new ConversionInput();
		conversionInpt.m = 100.0;
		// 2.Expected Output
		double expectedResult = 160.9;
		String expectedResult1 = "Conversion";
		double expectedResult2 = conversionInpt.m;
		// 3. Actual Output
		ConversionsOutput conversionOutpt = new ConversionsOutput();
		conversionOutpt = conversionObj.conversioncelsiusFahrenheit(conversionInpt);
		// 4.Asserts
		assertEquals(expectedResult, conversionOutpt.result, 1);

		assertEquals(expectedResult1, conversionOutpt.operations);

		assertEquals(expectedResult2, conversionOutpt.m);
	}
}
