package com.mobiera.aircast.api.v2.stats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.StatViewVO_v2;

@JsonInclude(Include.NON_NULL)
public class GetStatViewRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private GetStatViewRequestResult result;
	private String errorMessage;
	private StatViewVO_v2 statView;
	
	
	public GetStatViewRequestResult getResult() {
		return result;
	}
	public void setResult(GetStatViewRequestResult result) {
		this.result = result;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public StatViewVO_v2 getStatView() {
		return statView;
	}
	public void setStatView(StatViewVO_v2 statView) {
		this.statView = statView;
	}
	


}
