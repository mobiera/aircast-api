package com.mobiera.aircast.api.v1.device;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GetDeviceRequest implements Serializable
{
	private static final long serialVersionUID = 1241060039966633233L;
	private String tac;
	public final String getTac() {
		return tac;
	}
	public final void setTac(String tac) {
		this.tac = tac;
	}
	
}
