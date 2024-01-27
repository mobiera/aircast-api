package com.mobiera.aircast.api.v1.vaservice;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.VaServiceVO;

@JsonInclude(Include.NON_NULL)
public class ListVaServicesRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListVaServicesRequestResult result;
	private String errorMessage;
	private List<VaServiceVO> vaServices;
	public final ListVaServicesRequestResult getResult() {
		return result;
	}
	public final void setResult(ListVaServicesRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<VaServiceVO> getVaServices() {
		return vaServices;
	}
	public void setVaServices(List<VaServiceVO> vaServices) {
		this.vaServices = vaServices;
	}
	
	


}
