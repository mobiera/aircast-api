package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CreateFileRequestAnswer implements Serializable {

	private static final long serialVersionUID = 4267830307996294910L;
	private CreateFileRequestResult result;
	private String errorMessage;
	private Long id;
	public CreateFileRequestResult getResult() {
		return result;
	}
	public void setResult(CreateFileRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
