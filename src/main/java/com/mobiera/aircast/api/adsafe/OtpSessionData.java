package com.mobiera.aircast.api.adsafe;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OtpSessionData implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	

	private Long landingFk;
	private String userId;
	private String userIpAddr;
	private String otp;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserIpAddr() {
		return userIpAddr;
	}
	public void setUserIpAddr(String userIpAddr) {
		this.userIpAddr = userIpAddr;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public Long getLandingFk() {
		return landingFk;
	}
	public void setLandingFk(Long landingFk) {
		this.landingFk = landingFk;
	}
	
	

}
