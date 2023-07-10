package com.indus.pratice.service;

import com.indus.pratice.domain.AreaInput;
import com.indus.pratice.domain.AreaOutput;
import com.indus.pratice.expection.AreaException;

public interface IArea {
	public AreaOutput square(AreaInput areaInput) throws AreaException;
	public AreaOutput rectangle(AreaInput areaInput) throws AreaException;
	public AreaOutput triangle(AreaInput areaInput) throws AreaException;
	public AreaOutput circle(AreaInput areaInput) throws AreaException;
}
