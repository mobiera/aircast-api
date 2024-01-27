package com.mobiera.aircast.api.v1.ustk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;

@JsonInclude(Include.NON_NULL)
public class MoRequest extends UstkRequest
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@Required
	private String tpda;
	@Required
	private String mo;

	public String getTpda() {
		return tpda;
	}
	public void setTpda(String tpda) {
		this.tpda = tpda;
	}
	public String getMo() {
		return mo;
	}
	public void setMo(String mo) {
		this.mo = mo;
	}
	

	@Override
	@JsonIgnore
	public String getOptionalParam() {
		return MO_REQUEST;
	}
	
	
	
}
