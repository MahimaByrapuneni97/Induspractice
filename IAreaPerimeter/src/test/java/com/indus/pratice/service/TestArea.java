package com.indus.pratice.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.pratice.domain.AreaInput;
import com.indus.pratice.domain.AreaOutput;
import com.indus.pratice.expection.AreaException;
import com.indus.pratice.serviceimpl.Area;

public class TestArea {
private static IArea areaObj = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		areaObj = new Area();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		areaObj = null;
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
		AreaInput areaInput = new AreaInput();
	areaInput.setArea(10.0);
		// 2. Expected Output
	AreaOutput expAreaOutput = new AreaOutput();
	expAreaOutput.setOperation("square");
	expAreaOutput.setArea(10.0);
	expAreaOutput.setResult(100.0);
		// 3. Actual Output
	AreaOutput actAreaOutput = null;
	try {
		actAreaOutput = areaObj.square(areaInput);
	}catch (Exception e) {
		e.printStackTrace();
	}
		// 4. Asserts
	assertEquals(expAreaOutput, actAreaOutput);
	}
	@Test
	public void testRectangleSer() {
		// 1. Input
		AreaInput areaInput = new AreaInput();
	areaInput.setBeath(5.0);
	areaInput.setHeight(6.0);
		// 2. Expected Output
	AreaOutput expAreaOutput = new AreaOutput();
	expAreaOutput.setOperation("rectangle");
	expAreaOutput.setBeath(5.0);
	expAreaOutput.setHeight(6.0);
	expAreaOutput.setResult(15.0);
		// 3. Actual Output
	AreaOutput actAreaOutput = null;
	try {
		actAreaOutput = areaObj.rectangle(areaInput);
	}catch (Exception e) {
		e.printStackTrace();
	}
		// 4. Asserts
	assertEquals(expAreaOutput, actAreaOutput);
	}
	
	@Test
	public void testTriangleSer() {
		// 1. Input
		AreaInput areaInput = new AreaInput();
	areaInput.setLength(8.0);
	areaInput.setHeight(6.0);
		// 2. Expected Output
	AreaOutput expAreaOutput = new AreaOutput();
	expAreaOutput.setOperation("triangle");
	expAreaOutput.setLength(8.0);
	expAreaOutput.setHeight(6.0);
	expAreaOutput.setResult(48.0);
		// 3. Actual Output
	AreaOutput actAreaOutput = null;
	try {
		actAreaOutput = areaObj.triangle(areaInput);
	}catch (Exception e) {
		e.printStackTrace();
	}
		// 4. Asserts
	assertEquals(expAreaOutput, actAreaOutput);
	}
	@Test
	public void testCircleSer() {
		// 1. Input
		AreaInput areaInput = new AreaInput();
	areaInput.setBeath(5.0);
		// 2. Expected Output
	AreaOutput expAreaOutput = new AreaOutput();
	expAreaOutput.setOperation("circle");
	expAreaOutput.setBeath(5.0);
	expAreaOutput.setResult(78.53981633974483);
		// 3. Actual Output
	AreaOutput actAreaOutput = null;
	try {
		actAreaOutput = areaObj.circle(areaInput);
	}catch (Exception e) {
		e.printStackTrace();
	}
		// 4. Asserts
	assertEquals(expAreaOutput, actAreaOutput);
	}
}
