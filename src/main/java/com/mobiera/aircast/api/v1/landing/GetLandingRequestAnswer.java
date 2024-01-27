package com.mobiera.aircast.api.v1.landing;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.LandingVO;

@JsonInclude(Include.NON_NULL)
public class GetLandingRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3297798713620249354L;
	private GetLandingRequestResult result;
	private String errorMessage;
	private LandingVO landing;
	public final GetLandingRequestResult getResult() {
		return result;
	}
	public final void setResult(GetLandingRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public LandingVO getLanding() {
		return landing;
	}
	public void setLanding(LandingVO landing) {
		this.landing = landing;
	}
	
	
	


}
