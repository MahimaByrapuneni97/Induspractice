package com.indus.pratice.service;


import com.indus.pratice.domain.ConversionsInput;
import com.indus.pratice.domain.ConversionsOutput;

public class Conversions {
	public ConversionsOutput conversioncelsiusFahrenheit(ConversionsInput input) {
		ConversionsOutput ConversionOutpt = new ConversionsOutput();
		{
			double a = (input.getF() - 32) * 5 / 9;
			ConversionOutpt.setResult(a);
			ConversionOutpt.setF(input.getF());

		}
		return ConversionOutpt;

	}
}
