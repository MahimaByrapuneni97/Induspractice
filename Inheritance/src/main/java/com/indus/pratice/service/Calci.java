package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;

public class Calci {
	public CalciOutput addition(CalciInput input) {
		CalciOutput calOutput = new CalciOutput();

		double aa = input.getParameter1() + input.getParameter2();
		calOutput.geparameter1 = input.getParameter1();
		calOutput.parameter2 = input.getParameter2();
		calOutput.result = aa;
		calOutput.operation = "addition";
		return calOutput;

	}
	public CalciOutput subtraction(CalciInput input) {
		CalciOutput calOutput = new CalciOutput();

		double aa = input.parameter1 - input.parameter2;
		calOutput.parameter1 = input.parameter1;
		calOutput.parameter2 = input.parameter2;
		calOutput.result = aa;
		calOutput.operation = "subtraction";
		return calOutput;

	}
	public CalciOutput multiplication(CalciInput input) {
		CalciOutput calOutput = new CalciOutput();

		double aa = input.parameter1 * input.parameter2;
		calOutput.parameter1 = input.parameter1;
		calOutput.parameter2 = input.parameter2;
		calOutput.result = aa;
		calOutput.operation = "multiplication";
		return calOutput;

	}
	public CalciOutput division(CalciInput input) {
		CalciOutput calOutput = new CalciOutput();

		double aa = input.parameter1 / input.parameter2;
		calOutput.parameter1 = input.parameter1;
		calOutput.parameter2 = input.parameter2;
		calOutput.result = aa;
		calOutput.operation = "division";
		return calOutput;

	}
}
