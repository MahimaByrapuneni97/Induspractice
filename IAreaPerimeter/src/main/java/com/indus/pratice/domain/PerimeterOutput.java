package com.indus.pratice.domain;

public class PerimeterOutput {
	
	@Override
	public String toString() {
		return "PerimeterOutput [area=" + area + ", side=" + side + ", breath=" + breath + ", length=" + length
				+ ", width=" + width + ", radius=" + radius + ", result=" + result + ", operation=" + operation + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(breath);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(this.result);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(side);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
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
		PerimeterOutput other = (PerimeterOutput) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (Double.doubleToLongBits(breath) != Double.doubleToLongBits(other.breath))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		if (Double.doubleToLongBits(result) != Double.doubleToLongBits(other.result))
			return false;
		if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}
	public PerimeterOutput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
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
	private double area;
	private double side;
	private double breath;
	private double length;
	private double width;
	private double radius;
	private double result;
	private String operation = "perimeter";
}
