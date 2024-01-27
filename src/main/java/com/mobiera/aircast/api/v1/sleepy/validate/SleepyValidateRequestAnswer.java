package com.mobiera.aircast.api.v1.sleepy.validate;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SleepyValidateRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7297798713620249355L;
	private SleepyValidateRequestResult result;
	private String errorMessage;
	private Integer requiredMTs;
	public Integer getRequiredMTs() {
		return requiredMTs;
	}
	public void setRequiredMTs(Integer requiredMTs) {
		this.requiredMTs = requiredMTs;
	}
	public SleepyValidateRequestResult getResult() {
		return result;
	}
	public void setResult(SleepyValidateRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	


}
