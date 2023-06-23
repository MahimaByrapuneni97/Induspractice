package com.indus.pratice.conversions;

import junit.framework.TestCase;

public class TestConversion extends TestCase {
 Conversion convObj = null;
	protected void setUp() throws Exception {
		convObj = new Conversion();
	}

	protected void tearDown() throws Exception {
		convObj = null;
	}
	public void testCelsiusFahrenheitSer() {
		//1.input
		double f = 38.0;
		//2.Expected Output
		double expectedOutput = 3.3;
		//3.Actual Output
		double actualOutput = convObj.celsiusFahrenheit(f);
		//Asserts
		assertEquals(expectedOutput, actualOutput, 1);
		
		
	}
	public void testFahrenheitCelsiusSer() {
		//1.input
		double c = 108.0;
		//2.Expected Output
		double expectedOutput = 92.0;
		//3.Actual Output
		double actualOutput = convObj.fahrenheitCelsius(c);
		//Asserts
		assertEquals(expectedOutput, actualOutput, 0);
	}
	
	public void testPoundsKiloGramsSer() {
		//1.input
		double p = 50.0;
		//2.Expected Output
		double expectedOutput = 22.6;
		//3.Actual Output
		double actualOutput = convObj.poundsKiloGrams(p);
		//Asserts
		assertEquals(expectedOutput, actualOutput, 1);
	}
	public void testKiloGramsPoundsSer() {
		//1.input
		double k = 32.0;
		//2.Expected Output
		double expectedOutput = 70.54;
		//3.Actual Output
		double actualOutput = convObj.kiloGramsPounds(k);
		//Asserts
		assertEquals(expectedOutput, actualOutput, 2);
	}
	public void testMilesKiloMetersSer() {
		//1.input
		double m = 10.0;
		//2.Expected Output
		double expectedOutput = 16.0;
		//3.Actual Output
		double actualOutput = convObj.milesKiloMeters(m);
		//Asserts
		assertEquals(expectedOutput, actualOutput, 1);
	}
	public void testKiloMetersMilesSer() {
		//1.input
		double k = 70.0;
		//2.Expected Output
		double expectedOutput = 43.4;
		//3.Actual Output
		double actualOutput = convObj.kiloMetersMiles(k);
		//Asserts
		assertEquals(expectedOutput, actualOutput, 1);
	}
}
