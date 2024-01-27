package com.mobiera.aircast.api.v1.applet;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.AppletVO;

@JsonInclude(Include.NON_NULL)
public class ListAppletsRequestAnswer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5850441376773111676L;
	
	private ListAppletsRequestResult result;
	private String errorMessage;
	private List<AppletVO> applets;
	
	public ListAppletsRequestResult getResult() {
		return result;
	}
	public void setResult(ListAppletsRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<AppletVO> getApplets() {
		return applets;
	}
	public void setApplets(List<AppletVO> applets) {
		this.applets = applets;
	}
	
	

}
