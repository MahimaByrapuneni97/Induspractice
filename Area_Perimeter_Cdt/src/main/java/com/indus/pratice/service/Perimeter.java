package com.indus.pratice.service;

import com.indus.pratice.domain.PerimeterInput;
import com.indus.pratice.domain.PerimeterOutput;

public class Perimeter {
	public PerimeterOutput perimeterSquare(PerimeterInput input) {
		PerimeterOutput permiterOutpt = new PerimeterOutput();
		{
			double a = 4*input.getArea();
		      permiterOutpt.setResult(a);
		      permiterOutpt.setArea(input.getArea());
		}
	return permiterOutpt;
}
}
