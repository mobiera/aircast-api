package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TextData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 482935584529862375L;
	
	private String data;
	private byte[] md5;
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public byte[] getMd5() {
		return md5;
	}
	public void setMd5(byte[] md5) {
		this.md5 = md5;
	}
	
}
