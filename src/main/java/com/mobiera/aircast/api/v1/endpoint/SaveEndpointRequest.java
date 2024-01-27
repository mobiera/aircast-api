package com.mobiera.aircast.api.v1.endpoint;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.EndpointVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveEndpointRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private EndpointVO endpoint;
	@JsonIgnore
	private UserContextVO userContext;
	
	public final EndpointVO getEndpoint() {
		return endpoint;
	}
	public final void setEndpoint(EndpointVO endpoint) {
		this.endpoint = endpoint;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	

	
	
}
