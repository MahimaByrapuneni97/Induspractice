package com.indus.pratice.service;

import com.indus.pratice.domain.OceansInput;
import com.indus.pratice.domain.OceansOutput;
import com.indus.pratice.exception.OceansException;

public interface Oceans {
public OceansOutput Arctic(OceansInput oceanInput) throws OceansException;
public OceansOutput NorthAtlantic(OceansInput oceanInput) throws OceansException;
public OceansOutput SouthAtlantic(OceansInput oceanInput) throws OceansException;
public OceansOutput NorthPacific(OceansInput oceanInput) throws OceansException;
public OceansOutput SouthPacific(OceansInput oceanInput) throws OceansException;
public OceansOutput Indian(OceansInput oceanInput) throws OceansException;
public OceansOutput Southernoceans(OceansInput oceanInput) throws OceansException;
}
