package com.mobiera.aircast.api.adsafe;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class GetLandingRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	@JsonIgnore
	private UserContextVO userContext;
	
	private Long landingFk;
	private Long endpointFk;
	private String password;
	
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	public Long getEndpointFk() {
		return endpointFk;
	}
	public void setEndpointFk(Long endpointFk) {
		this.endpointFk = endpointFk;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getLandingFk() {
		return landingFk;
	}
	public void setLandingFk(Long landingFk) {
		this.landingFk = landingFk;
	}
	
	

}
