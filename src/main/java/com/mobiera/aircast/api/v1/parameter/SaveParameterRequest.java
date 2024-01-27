package com.mobiera.aircast.api.v1.parameter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.ParameterVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveParameterRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private ParameterVO parameter
	;
	@JsonIgnore
	private UserContextVO userContext;
	
	public ParameterVO getParameter() {
		return parameter;
	}
	public void setParameter(ParameterVO parameter) {
		this.parameter = parameter;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	
	
}
