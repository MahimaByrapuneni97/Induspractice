package com.indus.pratice.basics;

import com.indus.pratice.domain.PermiterInput;
import com.indus.pratice.domain.permiterOutput;

public class PermiterCdt {
	public permiterOutput perimeterSquare(PermiterInput input) {
		permiterOutput permiterOutpt = new permiterOutput();
		{
			double a = 4*input.area;
		      permiterOutpt.result = a;
		      permiterOutpt.area=input.area;
		}
	return permiterOutpt;	
	}
	
	public permiterOutput perimeterTringle(PermiterInput input) {
		permiterOutput permiterOutpt = new permiterOutput();
		{
			double a = (2*input.s)+input.b;
		      permiterOutpt.result = a;
		      permiterOutpt.b=input.b;
		      permiterOutpt.s = input.s;
		}
	return permiterOutpt;	
	}
	public permiterOutput perimeterRectangle(PermiterInput input) {
		permiterOutput permiterOutpt = new permiterOutput();
		{
			double a = 2*(input.l+input.w);
		      permiterOutpt.result = a;
		      permiterOutpt.l=input.l;
		      permiterOutpt.w = input.w;
		}
	return permiterOutpt;	
	}
	public permiterOutput perimeterCricle(PermiterInput input) {
		permiterOutput permiterOutpt = new permiterOutput();
		{
			double a = 2*Math.PI*input.r;
		      permiterOutpt.result = a;
		      permiterOutpt.r=input.r;
		    
		}
	return permiterOutpt;	
	}
}
