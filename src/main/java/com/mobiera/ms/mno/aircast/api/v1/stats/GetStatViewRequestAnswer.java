package com.mobiera.ms.mno.aircast.api.v1.stats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.mno.aircast.api.StatViewVO;

@JsonInclude(Include.NON_NULL)
public class GetStatViewRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private GetStatViewRequestResult result;
	private String errorMessage;
	private StatViewVO statView;
	
	
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
	public StatViewVO getStatView() {
		return statView;
	}
	public void setStatView(StatViewVO statView) {
		this.statView = statView;
	}
	


}
