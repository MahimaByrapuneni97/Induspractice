package com.indus.pratice.service;

import com.indus.pratice.domain.AreaInput;
import com.indus.pratice.domain.AreaOutput;

public class AreaCdt {
	public AreaOutput areaSquare(AreaInput input) {
		
		AreaOutput areaOutput = new AreaOutput();
		{
		double aa = input.a*input.a;
      areaOutput.result = aa;
      areaOutput.a=input.a;
		}

	      return areaOutput;
	}
	public AreaOutput areaRectangle(AreaInput input){
		AreaOutput areaOutput = new AreaOutput();
		{
			double a = (input.b*input.h)/2;
			areaOutput.result = a;
			areaOutput.b = input.b;
			areaOutput.h = input.h;
		}

      return areaOutput;
	}
	public AreaOutput areaTriangle(AreaInput input) {
		AreaOutput areaOutput = new AreaOutput();
		{
			double c = input.l*input.w;
			areaOutput.result = c;
			areaOutput.l = input.l;
			areaOutput.w = input.w;
		}
		return areaOutput;
	}
	public AreaOutput areaCircle(AreaInput input) {
		AreaOutput areaOutput = new AreaOutput();
		{
			double d = Math.PI*(input.r*input.r);
			areaOutput.result = d;
			areaOutput.r = input.r;
		}
		return areaOutput;
	}
}
