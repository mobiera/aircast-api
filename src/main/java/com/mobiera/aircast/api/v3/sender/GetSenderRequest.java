package com.mobiera.aircast.api.v3.sender;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class GetSenderRequest implements Serializable
{
	private static final long serialVersionUID = 3251160034966633233L;
	private Long id;

	@JsonIgnore
	private UserContextVO userContext;
	
	public final Long getId() {
		return id;
	}
	public final void setId(Long id) {
		this.id = id;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
}
