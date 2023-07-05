package com.indus.pratice.area_perimeter;

/**
 * Description: Find the area and parameter of triangle, square, circle and
 * rectangle.
 * 
 * @author MahimaByrapuneni
 *
 */
public class Area_Perimeter {
	public double squareArea(double area) {
		/**
		 * area: Always have positive numbers
		 * return : return result
		 */
		
		double result=0.0;
		{

		 result = area * area;
		}
		return result;
	}

	public double squarePerimeter(double area) {
		/**
		 * area: Always have positive numbers
		 * return : return result
		 */
		
		double result = 0.0;
		{
		result = 4 * area;
		}
		return result;
	}

	public double triangleArea(double b, double h) {
		/**
		 * b: Always have positive numbers
		 * h: Always have positive numbers
		 * return : return result
		 */
double result = 0.0;
{
		 result = (b * h) / 2;
}
		return result;

	}

	public double trianglePerimeter(double s, double b) {
		/**
		 * s: Always have positive numbers
		 * b: Always have positive numbers
		 * return : return result
		 */
		double result = 0.0;
		{
			result = (2 * s) + b;
		}
		return result;
	}
	public double rectangleArea(double l, double w) {
		/**
		 * l: Always have positive numbers
		 * w: Always have positive numbers
		 * return : return result
		 */
		double result=0.0;
		{
		result = l * w;
		}
		return result;

	}

	public double rectanglePerimeter(double l, double w) {
		/**
		 * l: Always have positive numbers
		 * w: Always have positive numbers
		 * return : return result
		 */
		double result=0.0;
		{
		 result = 2 * (l + w);
		}
		return result;
	}

	
	public double circleArea(double r) {
		/**
		 * r: Always have positive numbers
		 * return : return result
		 */
		double result = 0.0;
		{
			result = Math.PI*(r*r);
		}
		return result;
		}
	public double circlePerimeter(double r) {
		/**
		 * r: Always have positive numbers
		 * return : return result
		 */
		double result = 0.0;
		{
			result = 2* Math.PI*r;
		}
		return result;
	}
}
