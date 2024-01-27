package com.mobiera.aircast.api.v1.parameter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.ParameterType;

@JsonInclude(Include.NON_NULL)
public class ListParametersRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private String name;
	private ParameterType type;
	private String searchAttribute;
	
	
	@JsonIgnore
	private UserContextVO userContext;
	
	public ParameterType getType() {
		return type;
	}
	public void setType(ParameterType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public String getSearchAttribute() {
		return searchAttribute;
	}
	public void setSearchAttribute(String searchAttribute) {
		this.searchAttribute = searchAttribute;
	}
	
	
	
	
}
