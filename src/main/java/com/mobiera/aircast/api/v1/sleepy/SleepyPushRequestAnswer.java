package com.mobiera.aircast.api.v1.sleepy;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SleepyPushRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7297798713620249354L;
	private SleepyPushRequestResult result;
	private String errorMessage;
	
	public SleepyPushRequestResult getResult() {
		return result;
	}
	public void setResult(SleepyPushRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	


}
