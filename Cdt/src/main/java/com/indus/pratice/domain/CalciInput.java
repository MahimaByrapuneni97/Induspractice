package com.indus.pratice.domain;

public class CalciInput {
	 public double parameter1;
	 public double parameter2;
	public CalciInput() {
		
		// TODO Auto-generated constructor stub
	}
	public CalciInput(double parameter1, double parameter2) {
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
	}
	@Override
	public int hashCode() {
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
	public boolean equals(Object obj) {
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
	public double getParameter1() {
		return parameter1;
	}
	public void setParameter1(double parameter1) {
		this.parameter1 = parameter1;
	}
	public double getParameter2() {
		return parameter2;
	}
	public void setParameter2(double parameter2) {
		this.parameter2 = parameter2;
	}
	 
	
	}


