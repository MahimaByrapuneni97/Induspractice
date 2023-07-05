package com.indus.pratice.area_perimeter;

import junit.framework.TestCase;

public class TestArea extends TestCase {
  Area_Perimeter areaObj = null;
	protected void setUp() throws Exception {
		areaObj = new Area_Perimeter();
	}

	protected void tearDown() throws Exception {
		areaObj = null;
	}
	public void testSquareAreaSer1() {
		//1. input
		double area = 5.0;
		//2. Expected Output
		double expectedOutput = 25.0;
		//3. Actual Output
		double actualOutput = areaObj.squareArea(area);
		//4. Asserts
		assertEquals(expectedOutput, actualOutput, 0);
		
	}
	
	public void testRectangleAreaSer1() {
		//1. input
		double l = 5.0;
		double w = 4.0;
		//2. Expected Output
		double expectedOutput = 20.0;
		//3. Actual Output
		double actualOutput = areaObj.rectangleArea(l , w);
		//4. Asserts
		assertEquals(expectedOutput, actualOutput, 0);
		
}
	public void testTriangleAreaSer1() {
		//1. input
		double b = 2.0;
		double h = 6.0;
		//2. Expected Output
		double expectedOutput = 6.0;
		//3. Actual Output
		double actualOutput = areaObj.triangleArea(b, h);
		//4. Asserts
		assertEquals(expectedOutput, actualOutput, 0);
}
	public void testCircleAreaSer1() {
		//1. input
		double r = 8.0;
		
		//2. Expected Output
		double expectedOutput = 200.96;
		//3. Actual Output
		double actualOutput = areaObj.circleArea(r);
		//4. Asserts
		assertEquals(expectedOutput, actualOutput, 1);
}
}
