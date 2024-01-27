package com.mobiera.ms.mno.api.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class QueueUsage implements Serializable {
	
	private static final long serialVersionUID = -6447027211075159493L;
	String instanceId;
	Float usage;

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Float getUsage() {
		return usage;
	}

	public void setUsage(Float usage) {
		this.usage = usage;
	}
	
}
