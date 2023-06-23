package com.indus.pratice.conversions;
/**
 * Description: Converting Celsisus to fahrenheit, pounds to kilogarms, miles to kilometers and vice-versa
 * @author MahimaByrapuneni
 *
 */
public class Conversion {
	public double celsiusFahrenheit(double f) {
		/*
		 * F: Always have postive numbers.
		 * return: returns the result
		 */
		double result = 0.0;
		{
			result = (f - 32) * 5 / 9;
		}
		return result;
	}

	public double fahrenheitCelsius(double c) {
		/*
		 * C: Always have postive numbers.
		 * return: returns the result
		 */
		double result = 0.0;
		{
			result = (c * 5 / 9) + 32;
		}
		return result;
	}

	public double poundsKiloGrams(double p) {
		/*
		 * P: Always have postive numbers.
		 * return: returns the result
		 */
		double result = 0.0;
		{
			result = p / 2.2046;
		}
		return result;
	}

	public double kiloGramsPounds(double k) {
		/*
		 * K: Always have postive numbers.
		 * return: returns the result
		 */
		double result = 0.0;
		{
			result = k * 2.2046;
		}
		return result;
	}

	public double milesKiloMeters(double m) {
		/*
		 * M: Always have postive numbers.
		 * return: returns the result
		 */
		double result = 0.0;
		{
			result = m * 1.60934;

		}
		return result;
	}

	public double kiloMetersMiles(double k) {
		/*
		 * K: Always have postive numbers.
		 * return: returns the result
		 */
		double result = 0.0;
		{
			result = k / 1.60934;
		}
		return result;
	}

}
