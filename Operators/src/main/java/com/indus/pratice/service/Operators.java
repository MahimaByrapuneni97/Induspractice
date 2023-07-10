package com.indus.pratice.service;

import com.indus.pratice.domain.OperatorOutput;
import com.indus.pratice.domain.OperatorsInput;

public class Operators {
	public OperatorOutput matrixAddition(OperatorsInput input) {
		OperatorOutput operOutput = new OperatorOutput();
		double result[][] = new double[2][2];
		for (int c = 0; c < input.a.length; c++) {
			for (int d = 0; d < input.a[0].length; d++) {
				result[c][d] = input.a[c][d] + input.b[c][d];
			}
			operOutput.result = result;
			operOutput.a = input.a;
			operOutput.b = input.b;
		}
		return operOutput;
	}
	public OperatorOutput matrixAddition1(OperatorsInput input) {
		OperatorOutput operOutput = new OperatorOutput();
		int n = input.a.length;
		int m = input.a[0].length;
		double result[][] = new double[n][m];
		for (int c = 0; c < input.a.length; c++) {
			for (int d = 0; d < input.a[0].length; d++) {
				result[c][d] = input.a[c][d] + input.b[c][d];
			}
			operOutput.result = result;
			operOutput.a = input.a;
			operOutput.b = input.b;
		}
		return operOutput;
	}

	public OperatorOutput matrixMultiplication(OperatorsInput input) {
		OperatorOutput operOutput = new OperatorOutput();
		double result[][] = new double[2][2];
		for (int c = 0; c < input.a.length; c++) {
			for (int d = 0; d < input.a[c].length; d++) {
				double sum = 0.0;
				for (int e = 0; e < input.a.length; e++) {
					sum += input.a[c][e] * input.b[e][d];
				}
				result[c][d] = sum;
			}
			operOutput.result = result;
			operOutput.a = input.a;
			operOutput.b = input.b;
		}
		return operOutput;
	}

	public OperatorOutput matrixMultiplication1(OperatorsInput input) {
		OperatorOutput operOutput = new OperatorOutput();
		double result[][] = new double[2][2];
		for (int c = 0; c < input.a.length; c++) {
			for (int d = 0; d < input.a[c].length; d++) {
				double sum = 0.0;
				for (int e = 0; e < input.a.length; e++) {
					sum += input.a[c][e] * input.b[e][d];
				}
				result[c][d] = sum;
			}
			operOutput.result = result;
			operOutput.a = input.a;
			operOutput.b = input.b;
		}
		return operOutput;
	}
	public OperatorOutput matrixMultiplication2(OperatorsInput input) {
		OperatorOutput operOutput = new OperatorOutput();
		
		int n = input.a.length;
		int m = input.a[0].length;
		int p = input.b[0].length;
		double result[][] = new double[ n][ p];
		for (int c = 0; c < n; c++) {
			for (int d = 0; d < p; d++) {
				double sum = 0.0;
				for (int e = 0; e < m; e++) {
					sum += input.a[c][e] * input.b[e][d];
				}
				result[c][d] = sum;
			}
			operOutput.result = result;
			operOutput.a = input.a;
			operOutput.b = input.b;
		}
		return operOutput;
}
	
}