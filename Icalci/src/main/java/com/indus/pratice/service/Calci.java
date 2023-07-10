package com.indus.pratice.service;

import com.indus.pratice.domain.CalciInput;
import com.indus.pratice.domain.CalciOutput;

public class Calci {
	/*
	 * public CalciOutput addition(CalciInput input) { CalciOutput calOutput = new
	 * CalciOutput(); {
	 * 
	 * double aa = input.getPar1() + input.getPar2();
	 * calOutput.setPar1(input.getPar1()); calOutput.setPar2(input.getPar2());
	 * calOutput.setResult(aa); calOutput.setOperation("addition");
	 * 
	 * } return calOutput; }
	 * 
	 * public CalciOutput subtraction(CalciInput input) { CalciOutput calOutput =
	 * new CalciOutput(); { double aa = input.getPar1() - input.getPar2();
	 * calOutput.setPar1(input.getPar1()); calOutput.setPar2(input.getPar2());
	 * calOutput.setResult(aa); calOutput.setOperation("Subtraction");
	 * 
	 * } return calOutput; }
	 * 
	 * public CalciOutput multiplication(CalciInput input) { CalciOutput calOutput =
	 * new CalciOutput(); { double aa = input.getPar1() * input.getPar2();
	 * calOutput.setPar1(input.getPar1()); calOutput.setPar2(input.getPar2());
	 * calOutput.setResult(aa); calOutput.setOperation("multiplication");
	 * 
	 * } return calOutput; }
	 * 
	 * public CalciOutput division(CalciInput input) { CalciOutput calOutput = new
	 * CalciOutput(); { double aa = input.getPar1() / input.getPar2();
	 * calOutput.setPar1(input.getPar1()); calOutput.setPar2(input.getPar2());
	 * calOutput.setResult(aa); calOutput.setOperation("division"); } return
	 * calOutput; }
	 */
	public CalciOutput division1(CalciInput input) {
		CalciOutput calOutput = new CalciOutput();
		try {
			

			int div =  input.getPar1() / input.getPar2();
			calOutput.setPar1(input.getPar1());
			calOutput.setPar2(input.getPar2());
			calOutput.setResult(div);
			calOutput.setOperation("division");
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return calOutput;
	
	}
}
