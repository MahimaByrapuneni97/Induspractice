package com.indus.pratice.domain;

public class PerimeterOutput {
	private double area;
	private double s;
	private double b;
	private double l;
	private double w;
	private double r;
	private double result;
	private String Operations = "perimeter";
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getOperations() {
		return Operations;
	}
	public void setOperations(String operations) {
		Operations = operations;
	}
}
