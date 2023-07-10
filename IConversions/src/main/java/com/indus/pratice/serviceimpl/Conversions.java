package com.indus.pratice.serviceimpl;

import com.indus.pratice.domain.ConversionsInput;
import com.indus.pratice.domain.ConversionsOutput;
import com.indus.pratice.exception.ConversionsException;
import com.indus.pratice.service.IConversions;

public class Conversions implements IConversions {

	public ConversionsOutput fahrenheit(ConversionsInput conInput) throws ConversionsException {
		ConversionsOutput conOutObj = null;
		{
			if (conInput == null) {
				throw new ConversionsException("Objects cannot be null");
			}else {
				try {
					double fahrenheit =conInput.getFahrenheit();
					double result = (conInput.getFahrenheit() - 32) * 5 / 9;
					conOutObj = new ConversionsOutput();
					conOutObj.setFahrenheit(fahrenheit);
					conOutObj.setOperations("fahrenheit");
					conOutObj.setResult(result);
				}catch (Exception e) {
					throw new ConversionsException("unknown exception arised", e);
				}
				
				
			}
		}
		return conOutObj;
	}

	public ConversionsOutput pounds(ConversionsInput conInput)throws ConversionsException  {
		ConversionsOutput conOutObj = null;
		{
			if(conInput == null) {
				throw new ConversionsException("objects cannot be null");
			}else {
				try {
					double pounds = conInput.getPounds();
					double result = conInput.getPounds() * 2.2;
					conOutObj = new ConversionsOutput();
					conOutObj.setPounds(pounds);
					conOutObj.setOperations("pounds");
					conOutObj.setResult(result);
				}catch (Exception e) {
				throw new ConversionsException("unknow exception arised", e);
				}
			}
		}
		return conOutObj;
	}

	public ConversionsOutput miles(ConversionsInput conInput)throws ConversionsException {
		ConversionsOutput conOutObj = null;
		{
			if(conInput == null) {
				throw new ConversionsException("objects cannot be null");
			}else {
				try {
					double miles = conInput.getMiles();
					double result = conInput.getMiles() * 1.60934;
					conOutObj = new ConversionsOutput();
					conOutObj.setMiles(miles);
					conOutObj.setOperations("miles");
					conOutObj.setResult(result);
				}catch (Exception e) {
				throw new ConversionsException("unknow exception arised", e);
				}
			}
		}
		return conOutObj;
	}
	

}
