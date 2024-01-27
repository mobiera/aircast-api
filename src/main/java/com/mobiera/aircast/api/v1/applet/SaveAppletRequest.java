package com.mobiera.aircast.api.v1.applet;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.AppletVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveAppletRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	private AppletVO applet;
	@JsonIgnore
	private UserContextVO userContext;
	
	public AppletVO getApplet() {
		return applet;
	}

	public void setApplet(AppletVO applet) {
		this.applet = applet;
	}

	public UserContextVO getUserContext() {
		return userContext;
	}

	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}

}
