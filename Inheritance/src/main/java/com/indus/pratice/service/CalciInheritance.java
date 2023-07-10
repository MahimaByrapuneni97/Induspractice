package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;

public class CalciInheritance extends Calci{
	public CalciOutput squareRoot(CalciInput input) {
		CalciOutput calOutput = new CalciOutput();
		double aa = Math.sqrt(input.parameter1);
		calOutput.parameter1 = input.parameter1;
		calOutput.result = aa;
		calOutput.operation = "squareroot";
		return calOutput;
	}

}
