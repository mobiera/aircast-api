package com.mobiera.aircast.api.v1.sms;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SmsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1297798713620249354L;
	private SmsRequestResult result;
	private String errorMessage;
	
	public SmsRequestResult getResult() {
		return result;
	}
	public void setResult(SmsRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	


}
