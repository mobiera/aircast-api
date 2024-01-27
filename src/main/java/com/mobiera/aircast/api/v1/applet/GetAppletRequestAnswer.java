package com.mobiera.aircast.api.v1.applet;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.AppletVO;

@JsonInclude(Include.NON_NULL)
public class GetAppletRequestAnswer implements Serializable {


	private static final long serialVersionUID = 7944962553757092867L;
	
	private GetAppletRequestResult result;
	private String errorMessage;
	private AppletVO applet;
	
	public GetAppletRequestResult getResult() {
		return result;
	}
	public void setResult(GetAppletRequestResult result) {
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
