package com.mobiera.aircast.api.adsafe;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.commons.enums.UserIdType;
import com.mobiera.aircast.commons.enums.UserType;

@JsonInclude(Include.NON_NULL)
public class GetSubscriptionRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	@JsonIgnore
	private UserContextVO userContext;
	

	private Long id;
	private Long endpointFk;
	private Long identifierFk;
	private Long landingFk;
	private Long vaServiceFk;
	private Long pricepointFk;
	private UUID authCode; 
	private String userId;
	private UserIdType userIdType;
	private String password;
	
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
	public Long getPricepointFk() {
		return pricepointFk;
	}
	public void setPricepointFk(Long pricepointFk) {
		this.pricepointFk = pricepointFk;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getLandingFk() {
		return landingFk;
	}
	public void setLandingFk(Long landingFk) {
		this.landingFk = landingFk;
	}
	public UUID getAuthCode() {
		return authCode;
	}
	public void setAuthCode(UUID authCode) {
		this.authCode = authCode;
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
	
}
