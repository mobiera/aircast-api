package com.mobiera.aircast.api.v1.vaservice;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.VaServiceVO;

@JsonInclude(Include.NON_NULL)
public class GetVaServiceRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3297798713620249354L;
	private GetVaServiceRequestResult result;
	private String errorMessage;
	private VaServiceVO vaService;
	public final GetVaServiceRequestResult getResult() {
		return result;
	}
	public final void setResult(GetVaServiceRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public VaServiceVO getVaService() {
		return vaService;
	}
	public void setVaService(VaServiceVO vaService) {
		this.vaService = vaService;
	}
	
	


}
