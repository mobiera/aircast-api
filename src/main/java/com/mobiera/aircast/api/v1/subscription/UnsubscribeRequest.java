package com.mobiera.aircast.api.v1.subscription;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.PreferenceType;
import com.mobiera.aircast.commons.enums.UserIdType;

@JsonInclude(Include.NON_NULL)
public class UnsubscribeRequest implements Serializable {

	private static final long serialVersionUID = -3856395241874212410L;
	
	@JsonIgnore
	private UserContextVO userContext;
	
	private Long id;
	private String userId;
	private UserIdType userIdType;
	private Long identifierFk;
	
	
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Long getIdentifierFk() {
		return identifierFk;
	}
	public void setIdentifierFk(Long identifierFk) {
		this.identifierFk = identifierFk;
	}
	public UserIdType getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(UserIdType userIdType) {
		this.userIdType = userIdType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
	

}
