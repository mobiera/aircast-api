package com.mobiera.aircast.api.v1.endpoint;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.EndpointVO;

@JsonInclude(Include.NON_NULL)
public class ListEndpointsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListEndpointsRequestResult result;
	private String errorMessage;
	private List<EndpointVO> endpoints;
	public final ListEndpointsRequestResult getResult() {
		return result;
	}
	public final void setResult(ListEndpointsRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final List<EndpointVO> getEndpoints() {
		return endpoints;
	}
	public final void setEndpoints(List<EndpointVO> endpoints) {
		this.endpoints = endpoints;
	}
	
	
	


}
