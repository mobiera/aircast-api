package com.mobiera.aircast.api.v1.sms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TextSmsRequest extends SmsRequest
{
	private static final long serialVersionUID = 241060010966633233L;
	private String text;
	private Boolean flash;
	private String serviceTpda;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Boolean getFlash() {
		return flash;
	}
	public void setFlash(Boolean flash) {
		this.flash = flash;
	}
	public String getServiceTpda() {
		return serviceTpda;
	}
	public void setServiceTpda(String serviceTpda) {
		this.serviceTpda = serviceTpda;
	}
	
	
	
}
