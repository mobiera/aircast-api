package com.mobiera.aircast.api.adsafe;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OtpRequestResponse implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	private UUID otpRequestId;

	public UUID getOtpRequestId() {
		return otpRequestId;
	}

	public void setOtpRequestId(UUID otpRequestId) {
		this.otpRequestId = otpRequestId;
	}

	
	

}
