package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;

public class Calci {

	public CalciOutput addition(CalciInput input) {
		CalciOutput calOutput = new CalciOutput();

		double aa = input.parameter1 + input.parameter2;
		calOutput.parameter1 = input.parameter1;
		calOutput.parameter2 = input.parameter2;
		calOutput.result = aa;
		calOutput.operation = "addition";
		return calOutput;

	}

}
