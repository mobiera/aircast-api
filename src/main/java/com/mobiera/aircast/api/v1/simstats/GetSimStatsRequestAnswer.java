package com.mobiera.aircast.api.v1.simstats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.StatViewVO_v2;

@JsonInclude(Include.NON_NULL)
public class GetSimStatsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private GetSimStatsRequestResult result;
	private String errorMessage;
	private String available;
	
	
	public GetSimStatsRequestResult getResult() {
		return result;
	}
	public void setResult(GetSimStatsRequestResult result) {
		this.result = result;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
	

}
