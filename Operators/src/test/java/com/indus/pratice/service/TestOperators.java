package com.indus.pratice.service;

import com.indus.pratice.domain.OperatorOutput;
import com.indus.pratice.domain.OperatorsInput;
import com.indus.pratice.service.Operators;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class TestOperators extends TestCase {
	Operators oprObj = new Operators();

	protected void setUp() throws Exception {
		oprObj = new Operators();
	}

	protected void tearDown() throws Exception {
		oprObj = null;
	}

	public void testSenOperators() {
		// 1.input
		OperatorsInput operInput = new OperatorsInput();
		double a[][] = { { 2, 3 }, { 4, 5 } };
		double b[][] = { { 5, 2 }, { 8, 9 } };
		operInput.a = a;
		operInput.b = b;
		// 2.Expected Output
		double expectedOutput[][] = { { 7, 5 }, { 12, 14 } };
		// 3.Actual Output
		OperatorOutput operatorOutput = new OperatorOutput();
		operatorOutput = oprObj.matrixAddition(operInput);
		// 4.Asserts
		for (int i = 0; i < operatorOutput.result.length; i++) {
			for (int j = 0; j < operatorOutput.result.length; j++) {
				assertEquals(expectedOutput[i][j], operatorOutput.result[i][j]);
			}
		}

	}
	public void testSenOperators1() {
		// 1.input
		OperatorsInput operInput = new OperatorsInput();
		double a[][] = { { 2, 3, 5 }, { 4, 5, 2 } };
		double b[][] = { { 5, 2, 4 }, { 8, 9, 3 } };
		operInput.a = a;
		operInput.b = b;
		// 2.Expected Output
		double expectedOutput[][] = { { 7, 5, 9 }, { 12, 14, 5 } };
		// 3.Actual Output
		OperatorOutput operatorOutput = new OperatorOutput();
		operatorOutput = oprObj.matrixAddition1(operInput);
		// 4.Asserts
		for (int i = 0; i < operatorOutput.result.length; i++) {
			for (int j = 0; j < operatorOutput.result.length; j++) {
				assertEquals(expectedOutput[i][j], operatorOutput.result[i][j]);
			}
		}

	}

	public void testSenMultiplication() {
		// 1.input
		OperatorsInput operInput = new OperatorsInput();
		double a[][] = { { 1, 2 }, { 3, 4 } };
		double b[][] = { { 5, 6 }, { 7, 8 } };
		operInput.a = a;
		operInput.b = b;
		// 2.Expected Output
		double expectedOutput[][] = { { 19, 22 }, { 43, 50 } };
		// 3.Actual Output
		OperatorOutput operatorOutput = new OperatorOutput();
		operatorOutput = oprObj.matrixMultiplication(operInput);
		// 4.Asserts
		for (int i = 0; i < operatorOutput.result.length; i++) {
			for (int j = 0; j < operatorOutput.result.length; j++) {
				assertEquals(expectedOutput[i][j], operatorOutput.result[i][j]);
			}
		}

	}

	public void testSenMultiplication1() {
		// 1.input
		OperatorsInput operInput = new OperatorsInput();
		double a[][] = { { 7, 5 }, { 6, 3 } };
		double b[][] = { { 2, 1, 4 }, { 5, 1, 2 } };
		operInput.a = a;
		operInput.b = b;
		// 2.Expected Output
		double expectedOutput[][] = { { 39, 12, 38 }, { 27, 9, 30 } };
		// 3.Actual Output
		OperatorOutput operatorOutput = new OperatorOutput();
		operatorOutput = oprObj.matrixMultiplication(operInput);
		// 4.Asserts
		for (int i = 0; i < operatorOutput.result.length; i++) {
			for (int j = 0; j < operatorOutput.result.length; j++) {
				assertEquals(expectedOutput[i][j], operatorOutput.result[i][j]);
			}
		}

	}
	public void testSenMultiplication2() {
		// 1.input
		OperatorsInput operInput = new OperatorsInput();
		double a[][] = { { 7, 5 }, { 6, 3 } };
		double b[][] = { { 2, 1, 4 }, { 5, 1, 2 } };
		operInput.a = a;
		operInput.b = b;
		// 2.Expected Output
		double expectedOutput[][] = { { 39, 12, 38 }, { 27, 9, 30 } };
		// 3.Actual Output
		OperatorOutput operatorOutput = new OperatorOutput();
		operatorOutput = oprObj.matrixMultiplication(operInput);
		// 4.Asserts
		for (int i = 0; i < operatorOutput.result.length; i++) {
			for (int j = 0; j < operatorOutput.result.length; j++) {
				assertEquals(expectedOutput[i][j], operatorOutput.result[i][j]);
			}
		}

	}
}
