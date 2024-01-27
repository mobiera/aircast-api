package com.mobiera.ms.mno.api.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Tps implements Serializable {
	private static final long serialVersionUID = 1645904187938241349L;
	private String instanceId;
	private Integer tps;
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public Integer getTps() {
		return tps;
	}
	public void setTps(Integer tps) {
		this.tps = tps;
	}
}
