package com.mobiera.aircast.api.v3.user;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SyncAllRequestAnswer implements Serializable {

	private static final long serialVersionUID = 3367830307996294910L;
	private SyncAllRequestResult result;
	private String message;
	private String errorMessage;

	public SyncAllRequestResult getResult() {
		return result;
	}
	public void setResult(SyncAllRequestResult result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
