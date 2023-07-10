package com.indus.pratice.service;

import com.indus.pratice.domain.PerimeterInput;
import com.indus.pratice.domain.PerimeterOutput;
import com.indus.pratice.expection.PerimeterException;

public interface IPerimeter  {
	public PerimeterOutput square(PerimeterInput perInput) throws PerimeterException;
	public PerimeterOutput rectangle(PerimeterInput perInput) throws PerimeterException;
	public PerimeterOutput triangle(PerimeterInput perInput) throws PerimeterException;
	public PerimeterOutput circle(PerimeterInput perInput) throws PerimeterException;
	

}
