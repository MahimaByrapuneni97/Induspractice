package com.indus.pratice.service;

import com.indus.pratice.domain.AreaInput;
import com.indus.pratice.domain.AreaOutput;

public class Area {
public AreaOutput areaSquare(AreaInput input) {
		
		AreaOutput areaOutput = new AreaOutput();
		{
		double aa = input.getArea()*input.getArea();
      areaOutput.setResult(aa);
      areaOutput.setArea(input.getArea());
		}

	      return areaOutput;
	}
}