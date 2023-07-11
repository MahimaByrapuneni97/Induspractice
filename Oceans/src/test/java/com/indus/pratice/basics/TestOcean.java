package com.indus.pratice.basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.indus.pratice.exception.ENumException;

public class TestOcean {
private static final Enum enumInstance = new Enum();
private static Enum ocenaObj = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ocenaObj = new Enum();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ocenaObj = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	
	 public void testOceans() {
		   
		        // 1. Input
		        Ocean inputOcean = Ocean.ARCTIC;

		        // 2. Expected Output
		        String expectedDirection1 = "north";
		        String expectedDirection2 = "west";

		        // 3. Actual Output
		        String actualDirection1 = null;
		        String actualDirection2 = null;
		        try {
		        Ocean actualOcean = enumInstance.oceans(inputOcean);
		        String actualDirection11 = actualOcean.getDirection1();
		        String actualDirection21 = actualOcean.getDirection2();
		        } catch (ENumException e) {
			        e.printStackTrace();

		        // 4. Assertions
		        assertEquals(expectedDirection1, actualDirection1);
		        assertEquals(expectedDirection2, actualDirection2);

		     

		   
		    }
		
}
}







