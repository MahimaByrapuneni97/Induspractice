package com.indus.pratice.service;

import com.indus.pratice.domain.ConversionsInput;
import com.indus.pratice.domain.ConversionsOutput;
import com.indus.pratice.exception.ConversionsException;

public interface IConversions {
	public ConversionsOutput fahrenheit(ConversionsInput conInput) throws ConversionsException;
	public ConversionsOutput pounds(ConversionsInput conInput)throws ConversionsException;
	public ConversionsOutput miles(ConversionsInput conInput)throws ConversionsException;
}
