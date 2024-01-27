package com.mobiera.aircast.api.v1.sim;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SimVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveSimRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private SimVO sim;
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public SimVO getSim() {
		return sim;
	}
	public void setSim(SimVO sim) {
		this.sim = sim;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	
	
	
}
