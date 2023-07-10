package com.indus.pratice.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.pratice.domain.PerimeterInput;
import com.indus.pratice.domain.PerimeterOutput;
import com.indus.pratice.serviceimpl.Perimeter;

public class TestPerimeter {
private static IPerimeter perObj = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		perObj = new Perimeter();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		perObj = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSquareSer() {
		// 1. Input
		PerimeterInput perInput = new PerimeterInput();
		perInput.setArea(5.0);
		// 2. Expected Output
		PerimeterOutput expPerOut = new PerimeterOutput();
		expPerOut.setOperation("square");
		expPerOut.setArea(5.0);
		expPerOut.setResult(20.0);
		// 3. Actual Output
		PerimeterOutput actPerOut = null;
		try {
			actPerOut = perObj.square(perInput);
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Asserts
		assertEquals(expPerOut, actPerOut);
		
	}
	@Test
	public void testRectangleSer() {
		// 1. Input
		PerimeterInput perInput = new PerimeterInput();
		perInput.setLength(4.0);
		perInput.setWidth(5.0);
		// 2. Expected Output
		PerimeterOutput expPerOut = new PerimeterOutput();
		expPerOut.setOperation("rectangle");
		expPerOut.setLength(4.0);
		expPerOut.setWidth(5.0);
		expPerOut.setResult(40.0);
		// 3. Actual Output
		PerimeterOutput actPerOut = null;
		try {
			actPerOut = perObj.rectangle(perInput);
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Asserts
		assertEquals(expPerOut, actPerOut);
		
	}
	@Test
	public void testTriangleSer() {
		// 1. Input
		PerimeterInput perInput = new PerimeterInput();
		perInput.setSide(6.0);;
		perInput.setBreath(3.0);
		// 2. Expected Output
		PerimeterOutput expPerOut = new PerimeterOutput();
		expPerOut.setOperation("triangle");
		expPerOut.setSide(6.0);
		expPerOut.setBreath(3.0);
		expPerOut.setResult(36.0);
		// 3. Actual Output
		PerimeterOutput actPerOut = null;
		try {
			actPerOut = perObj.triangle(perInput);
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Asserts
		assertEquals(expPerOut, actPerOut);
		
	}
	@Test
	public void testCircleSer() {
		// 1. Input
		PerimeterInput perInput = new PerimeterInput();
		perInput.setRadius(8.0);
		// 2. Expected Output
		PerimeterOutput expPerOut = new PerimeterOutput();
		expPerOut.setOperation("circle");
		expPerOut.setRadius(8.0);
		expPerOut.setResult(50.26548245743669);
		// 3. Actual Output
		PerimeterOutput actPerOut = null;
		try {
			actPerOut = perObj.circle(perInput);
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 4. Asserts
		assertEquals(expPerOut, actPerOut);
		
	}
}
