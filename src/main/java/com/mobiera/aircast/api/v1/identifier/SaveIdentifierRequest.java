package com.mobiera.aircast.api.v1.identifier;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.IdentifierVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveIdentifierRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private IdentifierVO identifier;
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public IdentifierVO getIdentifier() {
		return identifier;
	}
	public void setIdentifier(IdentifierVO identifier) {
		this.identifier = identifier;
	}
	

	
	
}
