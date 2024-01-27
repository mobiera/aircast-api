package com.mobiera.aircast.api.adsafe;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class GetPricepointRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	@JsonIgnore
	private UserContextVO userContext;
	
	private Long endpointFk;
	private String password;
	private Long pricepointFk;
	
	
	public Long getPricepointFk() {
		return pricepointFk;
	}
	public void setPricepointFk(Long pricepointFk) {
		this.pricepointFk = pricepointFk;
	}
	
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
	
	

}
