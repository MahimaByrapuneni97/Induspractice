package com.indus.pratice.serviceimpl;

import com.indus.pratice.domain.PerimeterInput;
import com.indus.pratice.domain.PerimeterOutput;
import com.indus.pratice.expection.PerimeterException;
import com.indus.pratice.service.IPerimeter;

public class Perimeter implements IPerimeter {

	public PerimeterOutput square(PerimeterInput perInput) throws PerimeterException {
		PerimeterOutput perOutObj = null;
		{
			if (perInput == null) {
				throw new PerimeterException("objects cannot be null");
			}else {
				try {
					double area = perInput.getArea();
					double result = 4 * perInput.getArea();
					 perOutObj = new PerimeterOutput();
					 perOutObj.setOperation("square");
					 perOutObj.setArea(area);
					 perOutObj.setResult(result);
				}catch (Exception e) {
					throw new PerimeterException("unknown exception arised",e);
				}
			}
		}
		return perOutObj;
	}

	public PerimeterOutput rectangle(PerimeterInput perInput) throws PerimeterException {
		PerimeterOutput perOutObj = null;
		{
			if (perInput == null) {
				throw new PerimeterException("objects cannot be null");
			}else {
				try {
					double length = perInput.getLength();
					double width = perInput.getWidth();
					double result = 2*(perInput.getLength()*perInput.getWidth());
					 perOutObj = new PerimeterOutput();
					 perOutObj.setOperation("rectangle");
					 perOutObj.setLength(length);
					 perOutObj.setWidth(width);
					 perOutObj.setResult(result);
				}catch (Exception e) {
					throw new PerimeterException("unknown exception arised",e);
				}
			}
		}
		return perOutObj;
	}

	public PerimeterOutput triangle(PerimeterInput perInput) throws PerimeterException {
		PerimeterOutput perOutObj = null;
		{
			if (perInput == null) {
				throw new PerimeterException("objects cannot be null");
			}else {
				try {
					double side = perInput.getSide();
					double breath = perInput.getBreath();
					double result = (2*perInput.getSide())*perInput.getBreath();
					 perOutObj = new PerimeterOutput();
					 perOutObj.setOperation("triangle");
					 perOutObj.setBreath(breath);;
					 perOutObj.setSide(side);
					 perOutObj.setResult(result);
				}catch (Exception e) {
					throw new PerimeterException("unknown exception arised",e);
				}
			}
		}
		return perOutObj;
	}
	public PerimeterOutput circle(PerimeterInput perInput) throws PerimeterException {
		PerimeterOutput perOutObj = null;
		{
			if (perInput == null) {
				throw new PerimeterException("objects cannot be null");
			}else {
				try {
					double radius = perInput.getRadius();
					double result = 2*Math.PI*perInput.getRadius();
					 perOutObj = new PerimeterOutput();
					 perOutObj.setOperation("circle");
					 perOutObj.setRadius(radius);
					 perOutObj.setResult(result);
				}catch (Exception e) {
					throw new PerimeterException("unknown exception arised",e);
				}
			}
		}
		return perOutObj;
	}
}
