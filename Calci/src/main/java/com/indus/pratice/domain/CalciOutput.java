package com.indus.pratice.domain;

public class CalciOutput {
	private double parameter1;
	private double parameter2;
	private double result;
	private String Operators = "addition";
	public String operation;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Operators == null) ? 0 : Operators.hashCode());
		long temp;
		temp = Double.doubleToLongBits(getParameter1());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(getParameter2());
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(this.getResult());
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
		CalciOutput other = (CalciOutput) obj;
		if (Operators == null) {
			if (other.Operators != null)
				return false;
		} else if (!Operators.equals(other.Operators))
			return false;
		if (Double.doubleToLongBits(getParameter1()) != Double.doubleToLongBits(other.getParameter1()))
			return false;
		if (Double.doubleToLongBits(getParameter2()) != Double.doubleToLongBits(other.getParameter2()))
			return false;
		if (Double.doubleToLongBits(getResult()) != Double.doubleToLongBits(other.getResult()))
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
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	
}
	public void setOperation(String string) {
		// TODO Auto-generated method stub
		
	}
}


