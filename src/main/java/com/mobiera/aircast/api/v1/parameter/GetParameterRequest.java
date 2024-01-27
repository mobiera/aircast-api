package com.mobiera.aircast.api.v1.parameter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.ParameterName;

@JsonInclude(Include.NON_NULL)
public class GetParameterRequest implements Serializable
{
	private static final long serialVersionUID = 5241060034966633233L;
	
	ParameterName name;
	@JsonIgnore
	private UserContextVO userContext;
	
	public ParameterName getName() {
		return name;
	}

	public void setName(ParameterName name) {
		this.name = name;
	}

	public UserContextVO getUserContext() {
		return userContext;
	}

	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}

	

	
	
}
