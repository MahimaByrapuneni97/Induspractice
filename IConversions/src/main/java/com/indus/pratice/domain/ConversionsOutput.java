package com.indus.pratice.domain;

public class ConversionsOutput {
	private double fahrenheit;
	private double pounds;
	private double miles;
	private double result;
	private String operations = "Conversions";
	public double getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	public double getPounds() {
		return pounds;
	}
	public void setPounds(double pounds) {
		this.pounds = pounds;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getOperations() {
		return operations;
	}
	public void setOperations(String operations) {
		this.operations = operations;
	}
	public ConversionsOutput() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(fahrenheit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(miles);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((operations == null) ? 0 : operations.hashCode());
		temp = Double.doubleToLongBits(pounds);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ConversionsOutput other = (ConversionsOutput) obj;
		if (Double.doubleToLongBits(fahrenheit) != Double.doubleToLongBits(other.fahrenheit))
			return false;
		if (Double.doubleToLongBits(miles) != Double.doubleToLongBits(other.miles))
			return false;
		if (operations == null) {
			if (other.operations != null)
				return false;
		} else if (!operations.equals(other.operations))
			return false;
		if (Double.doubleToLongBits(pounds) != Double.doubleToLongBits(other.pounds))
			return false;
		if (Double.doubleToLongBits(result) != Double.doubleToLongBits(other.result))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ConversionsOutput [fahrenheit=" + fahrenheit + ", pounds=" + pounds + ", miles=" + miles + ", result="
				+ result + ", operations=" + operations + "]";
	}
	
}
