package com.mobiera.aircast.api.v3.user;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SyncAllRequest implements Serializable {

	private static final long serialVersionUID = -4396817586038514950L;
	
	@JsonIgnore
	private UserContextVO userContext;
	
	public UserContextVO getUserContext() {
		return userContext;
	}

	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	
	
	
	

}
