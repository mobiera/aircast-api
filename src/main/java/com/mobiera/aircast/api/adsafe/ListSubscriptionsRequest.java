package com.mobiera.aircast.api.adsafe;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.UserIdType;

@JsonInclude(Include.NON_NULL)
public class ListSubscriptionsRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	@JsonIgnore
	private UserContextVO userContext;
	

	private Long endpointFk;
	private UserIdType userIdType;
	private Long vaServiceFk;
	private String userId;
	private String password;
	private UUID authCode;
	
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public Long getEndpointFk() {
		return endpointFk;
	}
	public void setEndpointFk(Long endpointFk) {
		this.endpointFk = endpointFk;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getVaServiceFk() {
		return vaServiceFk;
	}
	public void setVaServiceFk(Long vaServiceFk) {
		this.vaServiceFk = vaServiceFk;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public UserIdType getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(UserIdType userIdType) {
		this.userIdType = userIdType;
	}
	public UUID getAuthCode() {
		return authCode;
	}
	public void setAuthCode(UUID authCode) {
		this.authCode = authCode;
	}
	

}
