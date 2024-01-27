package com.mobiera.aircast.api.v1.authorization;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserAuthorizationRequestAnswer implements Serializable
{
	private static final long serialVersionUID = 9097798713620249354L;
	private UserAuthorizationRequestResult result;
	private String errorMessage;
	private Long authorizationRequestId;
	
	public UserAuthorizationRequestResult getResult() {
		return result;
	}
	public void setResult(UserAuthorizationRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Long getAuthorizationRequestId() {
		return authorizationRequestId;
	}
	public void setAuthorizationRequestId(Long authorizationRequestId) {
		this.authorizationRequestId = authorizationRequestId;
	}
	

}
