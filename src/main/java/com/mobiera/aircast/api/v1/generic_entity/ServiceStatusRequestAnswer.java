package com.mobiera.aircast.api.v1.generic_entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.ServiceStatusVO;

@JsonInclude(Include.NON_NULL)
public class ServiceStatusRequestAnswer implements Serializable {
	

	private static final long serialVersionUID = 8765744603505042850L;
	
	private ServiceStatusRequestResult result;
	private String errorMessage;
	
	private ServiceStatusVO serviceStatus;

	public ServiceStatusRequestResult getResult() {
		return result;
	}

	public void setResult(ServiceStatusRequestResult result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ServiceStatusVO getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(ServiceStatusVO serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	
	
	
	
}
