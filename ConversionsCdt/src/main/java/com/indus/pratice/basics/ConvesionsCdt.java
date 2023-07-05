package com.indus.pratice.basics;

import com.indus.pratice.domain.ConversionInput;
import com.indus.pratice.domain.ConversionsOutput;

public class ConvesionsCdt {
	public ConversionsOutput conversioncelsiusFahrenheit(ConversionInput input) {
		ConversionsOutput ConversionOutpt = new ConversionsOutput();
		{
			double a = (input.f - 32) * 5 / 9;
			ConversionOutpt.result = a;
			ConversionOutpt.f = input.f;

		}
		return ConversionOutpt;

	}

	public ConversionsOutput conversionpoundsKiloGrams(ConversionInput input) {
		ConversionsOutput ConversionOutpt = new ConversionsOutput();
		{
			double a = input.p * 2.2;
			ConversionOutpt.result = a;
			ConversionOutpt.p = input.p;

		}
		return ConversionOutpt;

	}

	public ConversionsOutput conversionmilesKiloMeters(ConversionInput input) {
		ConversionsOutput ConversionOutpt = new ConversionsOutput();
		{
			double a = input.m * 1.60934;
			ConversionOutpt.result = a;
			ConversionOutpt.m = input.m;

		}
		return ConversionOutpt;
	}
}
