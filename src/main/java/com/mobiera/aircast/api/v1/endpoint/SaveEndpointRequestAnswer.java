package com.mobiera.aircast.api.v1.endpoint;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.EndpointVO;

@JsonInclude(Include.NON_NULL)
public class SaveEndpointRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private SaveEndpointRequestResult result;
	private String errorMessage;
	private EndpointVO endpoint;
	public final SaveEndpointRequestResult getResult() {
		return result;
	}
	public final void setResult(SaveEndpointRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final EndpointVO getEndpoint() {
		return endpoint;
	}
	public final void setEndpoint(EndpointVO endpoint) {
		this.endpoint = endpoint;
	}
	
}
