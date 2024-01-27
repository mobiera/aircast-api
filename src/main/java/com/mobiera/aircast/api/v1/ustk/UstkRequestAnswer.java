package com.mobiera.aircast.api.v1.ustk;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UstkRequestAnswer implements Serializable
{
	private static final long serialVersionUID = 9097798713620249354L;
	private UstkRequestResult result;
	private String errorMessage;
	
	public UstkRequestResult getResult() {
		return result;
	}
	public void setResult(UstkRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
