package com.indus.pratice.domain;

public class CalciInput {
	private double parameter1;
	private double parameter2;
	private CalciInput() {
		
		// TODO Auto-generated constructor stub
	}
	private CalciInput(double parameter1, double parameter2) {
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
	}
	@Override
	private int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(parameter1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(parameter2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	private boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalciInput other = (CalciInput) obj;
		if (Double.doubleToLongBits(parameter1) != Double.doubleToLongBits(other.parameter1))
			return false;
		if (Double.doubleToLongBits(parameter2) != Double.doubleToLongBits(other.parameter2))
			return false;
		return true;
	}
	private double getParameter1() {
		return parameter1;
	}
	private void setParameter1(double parameter1) {
		this.parameter1 = parameter1;
	}
	private double getParameter2() {
		return parameter2;
	}
	private void setParameter2(double parameter2) {
		this.parameter2 = parameter2;
	}
	 
	
	}




