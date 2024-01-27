package com.mobiera.aircast.api.v1.sim;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SimVO;

@JsonInclude(Include.NON_NULL)
public class GetSimRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private GetSimRequestResult result;
	private String errorMessage;
	private SimVO sim;
	
	
	public GetSimRequestResult getResult() {
		return result;
	}
	public void setResult(GetSimRequestResult result) {
		this.result = result;
	}
	public SimVO getSim() {
		return sim;
	}
	public void setSim(SimVO sim) {
		this.sim = sim;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	


}
