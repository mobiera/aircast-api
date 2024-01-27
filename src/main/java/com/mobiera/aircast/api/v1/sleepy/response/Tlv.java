package com.mobiera.aircast.api.v1.sleepy.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Represents configuration parameters of a STK sendSms command for Sleepy Response.
 * Used by Aircast internally, not through REST API.
 * <p>
 * <b>tag</b>: byte of the answered tag.
 * <p>
 * <b>value</b>: byte[] value returned by command execution.
 * <p>
 * <b>valueStr</b>: interpreted value converted to a String.
 * <p>
 * @author mj
 */

@JsonInclude(Include.NON_NULL)
public class Tlv implements Serializable {
	private static final long serialVersionUID = -7032180123970961419L;
	
	private byte tag;
	private byte[] value;
	private String valueStr;
	
	
	
	public byte getTag() {
		return tag;
	}
	public void setTag(byte tag) {
		this.tag = tag;
	}
	public byte[] getValue() {
		return value;
	}
	public void setValue(byte[] value) {
		this.value = value;
	}
	public String getValueStr() {
		return valueStr;
	}
	public void setValueStr(String valueStr) {
		this.valueStr = valueStr;
	}
	
	
}
