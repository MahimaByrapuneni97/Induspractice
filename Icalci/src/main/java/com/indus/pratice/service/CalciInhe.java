package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;

public class CalciInhe extends Calci {
	public CalciOutput squareroot(CalciInput input) {
		CalciOutput calOutput = new CalciOutput();
		{

			int aa = (int) Math.sqrt(input.getPar1());
			calOutput.setPar1(input.getPar1());
			calOutput.setResult(aa);
			calOutput.setOperation("squareroot");

		}
		return calOutput;
	}
}
