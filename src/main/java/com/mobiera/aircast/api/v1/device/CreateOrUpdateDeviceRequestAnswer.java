package com.mobiera.aircast.api.v1.device;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CreateOrUpdateDeviceRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6097798713620249354L;
	private CreateOrUpdateDeviceRequestResult result;
	private String errorMessage;
	
	public CreateOrUpdateDeviceRequestResult getResult() {
		return result;
	}
	public void setResult(CreateOrUpdateDeviceRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
