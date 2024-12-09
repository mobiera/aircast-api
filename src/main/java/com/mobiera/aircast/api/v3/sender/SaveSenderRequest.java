package com.mobiera.aircast.api.v3.sender;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SenderVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveSenderRequest implements Serializable
{
	private static final long serialVersionUID = 2141061934966633233L;
	private SenderVO sender;
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public SenderVO getSender() {
		return sender;
	}
	public void setSender(SenderVO sender) {
		this.sender = sender;
	}
	
}
