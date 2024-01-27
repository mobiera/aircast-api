package com.mobiera.aircast.api.v1.sleepy.action;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * A Variable is identified by its id.
 * @author mj
 */
@JsonInclude(Include.NON_NULL)
public class Variable implements Serializable {

	private static final long serialVersionUID = 238004388373380966L;
	private byte id = 0;
	
	
	public byte getId() {
		return id;
	}
	
	public void setId(int id)
	{
		this.id = (byte) id;
	}
	
}
