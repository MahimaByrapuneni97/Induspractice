package com.indus.pratice.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.pratice.domain.ConversionsInput;
import com.indus.pratice.domain.ConversionsOutput;
import com.indus.pratice.exception.ConversionsException;
import com.indus.pratice.serviceimpl.Conversions;

public class TestConversions {
private static IConversions conObj = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		conObj = new Conversions();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		conObj = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testfahrenheitSer() {
		//1. Input
		ConversionsInput conInput = new ConversionsInput();
		conInput.setFahrenheit(38.0);
		
		//2. Expected Output
		ConversionsOutput expCalOut = new ConversionsOutput();
		expCalOut.setOperations("fahrenheit");
		expCalOut.setFahrenheit(38.0);
		expCalOut.setResult(3.3333333333333335);
		//3. Actual Output
		ConversionsOutput actConOutput = null;
		try {
			actConOutput = conObj.fahrenheit(conInput);
		}catch (Exception e) {
		e.printStackTrace();
		}
		// 4. Arrests
		assertEquals(expCalOut, actConOutput);
	}
	@Test
	public void testPoundsSer() {
		//1. Input
		ConversionsInput conInput = new ConversionsInput();
		conInput.setPounds(50.0);
		
		//2. Expected Output
		ConversionsOutput expCalOut = new ConversionsOutput();
		expCalOut.setOperations("pounds");
		expCalOut.setPounds(50.0);
		expCalOut.setResult(110.00000000000001);
		//3. Actual Output
		ConversionsOutput actConOutput = null;
		try {
			actConOutput = conObj.pounds(conInput);
		}catch (Exception e) {
		e.printStackTrace();
		}
		// 4. Arrests
		assertEquals(expCalOut, actConOutput);

}
	@Test
	public void testMilesSer() {
		//1. Input
		ConversionsInput conInput = new ConversionsInput();
		conInput.setMiles(100.0);
		
		//2. Expected Output
		ConversionsOutput expCalOut = new ConversionsOutput();
		expCalOut.setOperations("miles");
		expCalOut.setMiles(100.0);
		expCalOut.setResult(160.934);
		//3. Actual Output
		ConversionsOutput actConOutput = null;
		try {
			actConOutput = conObj.miles(conInput);
		}catch (Exception e) {
		e.printStackTrace();
		}
		// 4. Arrests
		assertEquals(expCalOut, actConOutput);

}
}
