package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AssembleFileRequestAnswer implements Serializable {

	private static final long serialVersionUID = 4267830307996294910L;
	private AssembleFileRequestResult result;
	private String errorMessage;
	public AssembleFileRequestResult getResult() {
		return result;
	}
	public void setResult(AssembleFileRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	

}
