package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DeleteFileRequestAnswer implements Serializable {

	private static final long serialVersionUID = 4267830307996294910L;
	private DeleteFileRequestResult result;
	private String errorMessage;
	
	public DeleteFileRequestResult getResult() {
		return result;
	}
	public void setResult(DeleteFileRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
