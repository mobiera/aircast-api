package com.mobiera.aircast.api.v1.ustk;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;

@JsonInclude(Include.NON_NULL)
public class Item implements Serializable {
	
	private static final long serialVersionUID = -3288136543847941945L;
	@Required
	private String text;
	@Required
	private String value;
	private String mo;
	private String tpda;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getMo() {
		return mo;
	}
	public void setMo(String mo) {
		this.mo = mo;
	}
	public String getTpda() {
		return tpda;
	}
	public void setTpda(String tpda) {
		this.tpda = tpda;
	}
	
}