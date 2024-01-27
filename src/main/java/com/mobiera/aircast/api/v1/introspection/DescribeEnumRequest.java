package com.mobiera.aircast.api.v1.introspection;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.UIAction;

@JsonInclude(Include.NON_NULL)
public class DescribeEnumRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	
	@JsonIgnore
	private UserContextVO userContext;
	
	private UIAction uiAction;
	
	private String enumName;
	
	
	public String getEnumName() {
		return enumName;
	}
	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public UIAction getUiAction() {
		return uiAction;
	}
	public void setUiAction(UIAction uiAction) {
		this.uiAction = uiAction;
	}
	
	
}
