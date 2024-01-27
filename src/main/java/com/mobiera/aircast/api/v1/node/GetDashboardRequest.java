package com.mobiera.aircast.api.v1.node;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class GetDashboardRequest implements Serializable {
	
	private static final long serialVersionUID = 323797314627882100L;
	
	@JsonIgnore
	private UserContextVO userContext;

	public UserContextVO getUserContext() {
		return userContext;
	}

	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	

}
