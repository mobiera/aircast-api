package com.mobiera.aircast.api.v1.authorization;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserAuthorizationResponse implements Serializable
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	
	private UserAuthorizationResponseResult result;
	private Long requestId;
	private Long campaignId;
	
	private String errorMessage;
	
	
	
	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public UserAuthorizationResponseResult getResult() {
		return result;
	}

	public void setResult(UserAuthorizationResponseResult result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	
	
	
	
	
}
