package com.indus.pratice.domain;

public class AreaOutput {
	private double area;
	private double beath;
	private double height;
	private double length;
	private double result;
	private String operation = "Operation";
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getBeath() {
		return beath;
	}
	public void setBeath(double beath) {
		this.beath = beath;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public AreaOutput() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(beath);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		temp = Double.doubleToLongBits(this.result);
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
		AreaOutput other = (AreaOutput) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (Double.doubleToLongBits(beath) != Double.doubleToLongBits(other.beath))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (Double.doubleToLongBits(result) != Double.doubleToLongBits(other.result))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AreaOutput [area=" + area + ", beath=" + beath + ", height=" + height + ", length=" + length
				+ ", result=" + result + ", operation=" + operation + "]";
	}
}
