package com.indus.pratice.basics;

/**
 * Description: Basic java programming
 * 
 * @return
 */
public class Calc {
	/**
	 * Description: Subtraction of two parameters
	 * @param par1: Always have positive numbers
	 * @param par2:Always have positive numbers
	 * @return: return result value
	 */
	public double subtraction(double par1, double par2) {

		double result = 0.0;
		{
			
		result = par1 - par2;
		}
		return result;
	}
	public double multiplication(double parameter1, double parameter2) {
		double result = 0.0;
		{
		result = parameter1 * parameter2;
		}
		return result;
	}
	public double division(double parmeter1, double parmeter2) {
		double result = 0.0;
		{
		result = parmeter1 / parmeter2;
		}
		return result;
		
	}

}