package com.mobiera.aircast.api.v1.sleepy.command;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 * @author mj
 * Used to customize Applet response parameters (currently Sms Parameters).
 * Generally used by Aircast internally.
 */
@JsonInclude(Include.NON_NULL)
public class ResponseParameters implements Serializable {

	private static final long serialVersionUID = -6546963907186981457L;
	private SmsParameters smsParams;
	public SmsParameters getSmsParams() {
		return smsParams;
	}
	public void setSmsParams(SmsParameters smsParams) {
		this.smsParams = smsParams;
	}
	
	
	
	
}
