package com.mobiera.aircast.api.v1.file;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UploadedFileVO;

@JsonInclude(Include.NON_NULL)
public class ListFilesRequestAnswer implements Serializable {

	private static final long serialVersionUID = 4267830307996294910L;
	private ListFilesRequestResult result;
	private String errorMessage;
	private List<UploadedFileVO> files;
	
	public ListFilesRequestResult getResult() {
		return result;
	}
	public void setResult(ListFilesRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<UploadedFileVO> getFiles() {
		return files;
	}
	public void setFiles(List<UploadedFileVO> files) {
		this.files = files;
	}
	
	
	

}
