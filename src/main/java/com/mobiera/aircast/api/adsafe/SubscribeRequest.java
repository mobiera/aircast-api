package com.mobiera.aircast.api.adsafe;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.UserIdType;

@JsonInclude(Include.NON_NULL)
public class SubscribeRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	@JsonIgnore
	private UserContextVO userContext;
	

	private Long endpointFk;
	private Long identifierFk;
	private Long landingFk;
	private UUID requestId;
	private String password;
	private String userIpAddr;
	private String authCode;
	
	private String userId;
	private UserIdType userIdType;
	
	private String adData;
	
	
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
	public Long getIdentifierFk() {
		return identifierFk;
	}
	public void setIdentifierFk(Long identifierFk) {
		this.identifierFk = identifierFk;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserIpAddr() {
		return userIpAddr;
	}
	public void setUserIpAddr(String userIpAddr) {
		this.userIpAddr = userIpAddr;
	}
	
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public UUID getRequestId() {
		return requestId;
	}
	public void setRequestId(UUID requestId) {
		this.requestId = requestId;
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
	public Long getLandingFk() {
		return landingFk;
	}
	public void setLandingFk(Long landingFk) {
		this.landingFk = landingFk;
	}
	public String getAdData() {
		return adData;
	}
	public void setAdData(String adData) {
		this.adData = adData;
	}
	

}
