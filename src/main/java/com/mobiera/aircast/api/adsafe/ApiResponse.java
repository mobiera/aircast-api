package com.mobiera.aircast.api.adsafe;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.UserIdType;

@JsonInclude(Include.NON_NULL)
public class ApiResponse implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	private RequestStatusCode statusCode;
	private String errorMsg;
	public RequestStatusCode getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(RequestStatusCode statusCode) {
		this.statusCode = statusCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	

}
