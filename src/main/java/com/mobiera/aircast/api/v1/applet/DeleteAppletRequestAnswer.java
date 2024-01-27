package com.mobiera.aircast.api.v1.applet;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.AppletVO;

@JsonInclude(Include.NON_NULL)
public class DeleteAppletRequestAnswer implements Serializable {
	

	private static final long serialVersionUID = 8765744603505042850L;
	
	private DeleteAppletRequestResult result;
	private String errorMessage;
	private AppletVO applet;
	
	public DeleteAppletRequestResult getResult() {
		return result;
	}
	public void setResult(DeleteAppletRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public AppletVO getApplet() {
		return applet;
	}
	public void setApplet(AppletVO applet) {
		this.applet = applet;
	}

}
