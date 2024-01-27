package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RunCampaignRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3297798713627249354L;
	private RunCampaignRequestResult result;
	private String errorMessage;
	private Long runId;
	
	public final RunCampaignRequestResult getResult() {
		return result;
	}
	public final void setResult(RunCampaignRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Long getRunId() {
		return runId;
	}
	public void setRunId(Long runId) {
		this.runId = runId;
	}
	
	
	


}
