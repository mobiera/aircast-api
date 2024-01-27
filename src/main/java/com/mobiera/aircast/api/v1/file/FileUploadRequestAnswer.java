package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FileUploadRequestAnswer implements Serializable {

	private static final long serialVersionUID = 4267830307996294910L;
	private FileUploadRequestResult result;
	private String errorMessage;
	private Long id;
	
	public FileUploadRequestResult getResult() {
		return result;
	}
	public void setResult(FileUploadRequestResult result) {
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
