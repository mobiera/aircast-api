package com.mobiera.aircast.api.v1.sim;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CreateOrUpdateSimRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private CreateOrUpdateSimRequestResult result;
	private String errorMessage;
	
	public CreateOrUpdateSimRequestResult getResult() {
		return result;
	}
	public void setResult(CreateOrUpdateSimRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
