package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;

public class Calci {
	public CalciOutput addition(CalciInput calInput){
		CalciOutput calOutput = new CalciOutput();

		double aa = calInput.getParameter1() + calInput.getParameter2();
		calOutput.setParameter1(calInput.getParameter1());
		calOutput.setParameter2(calInput.getParameter2());
		calOutput.setResult(aa);
		calOutput.operation = "addition";
		
			return calOutput;
		
		}
}
