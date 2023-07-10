package com.indus.pratice.domain;

public class CalciOutput {
	private int Par1;
	private int par2;
	private int result;
	private String operation = "operations";
	public String operations;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Par1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		temp = Double.doubleToLongBits(getPar2());
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
		if (Double.doubleToLongBits(Par1) != Double.doubleToLongBits(other.Par1))
			return false;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (Double.doubleToLongBits(getPar2()) != Double.doubleToLongBits(other.getPar2()))
			return false;
		if (Double.doubleToLongBits(getResult()) != Double.doubleToLongBits(other.getResult()))
			return false;
		return true;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getPar1() {
		return Par1;
	}
	public void setPar1(int par1) {
		this.Par1 = par1;
	}
	public int getPar2() {
		return par2;
	}
	public void setPar2(int par2) {
		this.par2 = par2;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
