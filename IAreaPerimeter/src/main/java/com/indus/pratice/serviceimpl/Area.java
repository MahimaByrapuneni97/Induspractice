package com.indus.pratice.serviceimpl;

import com.indus.pratice.domain.AreaInput;
import com.indus.pratice.domain.AreaOutput;
import com.indus.pratice.expection.AreaException;
import com.indus.pratice.service.IArea;

public class Area implements IArea {

	public AreaOutput square(AreaInput areaInput) throws AreaException {
		AreaOutput areaOutObj = null;
		{
			if (areaInput == null) {
				throw new AreaException("object cannot be null");
			}else {
				try {
					double area = areaInput.getArea();
					double result = areaInput.getArea() * areaInput.getArea();
					areaOutObj = new AreaOutput();
					areaOutObj.setArea(area);
					areaOutObj.setOperation("square");
					areaOutObj.setResult(result);
				}catch (Exception e) {
				throw new AreaException("unknown exception ariased", e);
				}
				
			}
		}
		return areaOutObj;
	}

	public AreaOutput rectangle(AreaInput areaInput) throws AreaException {
		AreaOutput areaOutObj = null;
		{
			if (areaInput == null) {
				throw new AreaException("object cannot be null");
			}else {
				try {
					double beath = areaInput.getBeath();
					double height = areaInput.getHeight();
					double result = (areaInput.getBeath() * areaInput.getHeight())/2;
					areaOutObj = new AreaOutput();
					areaOutObj.setBeath(beath);
					areaOutObj.setHeight(height);
					areaOutObj.setOperation("rectangle");
					areaOutObj.setResult(result);
				}catch (Exception e) {
				throw new AreaException("unknown exception ariased", e);
				}
				
			}
		}
		return areaOutObj;
	}

	public AreaOutput triangle(AreaInput areaInput) throws AreaException {
		AreaOutput areaOutObj = null;
		{
			if (areaInput == null) {
				throw new AreaException("object cannot be null");
			}else {
				try {
					double length = areaInput.getLength();
					double height = areaInput.getHeight();
					double result = areaInput.getLength() * areaInput.getHeight();
					areaOutObj = new AreaOutput();
					areaOutObj.setLength(length);
					areaOutObj.setHeight(height);
					areaOutObj.setOperation("triangle");
					areaOutObj.setResult(result);
				}catch (Exception e) {
				throw new AreaException("unknown exception ariased", e);
				}
				
			}
		}
		return areaOutObj;
	}

	public AreaOutput circle(AreaInput areaInput) throws AreaException {
		AreaOutput areaOutObj = null;
		{
			if (areaInput == null) {
				throw new AreaException("object cannot be null");
			}else {
				try {
					double beath = areaInput.getBeath();
					double result = Math.PI*(areaInput.getBeath()*areaInput.getBeath());
					areaOutObj = new AreaOutput();
					areaOutObj.setBeath(beath);
					areaOutObj.setOperation("circle");
					areaOutObj.setResult(result);
				}catch (Exception e) {
				throw new AreaException("unknown exception ariased", e);
				}
				
			}
		}
		return areaOutObj;
	}

}
