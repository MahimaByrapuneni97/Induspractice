package com.indus.pratice.domain;

public class CalciOutput {
	private double parameter1;
	private double parameter2;
	private double result;
	private String operation;
	@Override
	private int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(parameter1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(parameter2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(this.result);
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
		CalciOutput other = (CalciOutput) obj;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		if (Double.doubleToLongBits(parameter1) != Double.doubleToLongBits(other.parameter1))
			return false;
		if (Double.doubleToLongBits(parameter2) != Double.doubleToLongBits(other.parameter2))
			return false;
		if (Double.doubleToLongBits(result) != Double.doubleToLongBits(other.result))
			return false;
		return true;
	}
	

	
}

}
