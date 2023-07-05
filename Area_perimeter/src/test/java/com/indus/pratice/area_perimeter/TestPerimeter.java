package com.indus.pratice.area_perimeter;

import junit.framework.TestCase;

public class TestPerimeter extends TestCase {
	Area_Perimeter areaObj = null;
	protected void setUp() throws Exception {
		areaObj = new Area_Perimeter();
	}

	protected void tearDown() throws Exception {
		areaObj = null;
	}
	public void testSquarePerimeterSer1() {
		//1. input
		double area = 5.0;
		//2. Expected Output
		double expectedOutput = 20.0;
		//3. Actual Output
		double actualOutput = areaObj.squarePerimeter(area);
		//4. Asserts
		assertEquals(expectedOutput, actualOutput, 0);
		
	}
	
	public void testRectanglePerimeterSer1() {
		//1. input
		double l = 5.0;
		double w = 4.0;
		//2. Expected Output
		double expectedOutput = 18.0;
		//3. Actual Output
		double actualOutput = areaObj.rectanglePerimeter(l , w);
		//4. Asserts
		assertEquals(expectedOutput, actualOutput, 0);
		
}
	public void testTrianglePerimeterSer1() {
		//1. input
		double s = 2.0;
		double b = 6.0;
		//2. Expected Output
		double expectedOutput = 10.0;
		//3. Actual Output
		double actualOutput = areaObj.trianglePerimeter(s, b);
		//4. Asserts
		assertEquals(expectedOutput, actualOutput, 0);
}
	public void testCircleperimeterSer1() {
		//1. input
		double r = 8.0;
		
		//2. Expected Output
		double expectedOutput = 50.24;
		//3. Actual Output
		double actualOutput = areaObj.circlePerimeter(r);
		//4. Asserts
		assertEquals(expectedOutput, actualOutput, 1);
}
}
