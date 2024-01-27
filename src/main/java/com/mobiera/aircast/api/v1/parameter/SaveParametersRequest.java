package com.mobiera.aircast.api.v1.parameter;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.ParameterVO;
import com.mobiera.aircast.api.vo.UserContextVO;


@JsonInclude(Include.NON_NULL)
public class SaveParametersRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private List<ParameterVO> parameters;

	@JsonIgnore
	private UserContextVO userContext;

	public List<ParameterVO> getParameters() {
		return parameters;
	}
	public void setParameters(List<ParameterVO> parameters) {
		this.parameters = parameters;
	}

	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	
	
}
