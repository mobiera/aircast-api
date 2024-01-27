package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UploadedFileVO;

@JsonInclude(Include.NON_NULL)
public class GetFileRequestAnswer implements Serializable {

	private static final long serialVersionUID = 4267830307996294910L;
	private GetFileRequestResult result;
	private String errorMessage;
	private UploadedFileVO file;
	
	public GetFileRequestResult getResult() {
		return result;
	}
	public void setResult(GetFileRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public UploadedFileVO getFile() {
		return file;
	}
	public void setFile(UploadedFileVO file) {
		this.file = file;
	}
	
	

}
