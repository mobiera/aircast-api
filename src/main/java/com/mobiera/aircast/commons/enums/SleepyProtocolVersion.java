package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SleepyProtocolVersion implements Serializable {

	V1(0,1),V2(1,2);

	private Integer protocolVersion = null;

	private SleepyProtocolVersion(Integer index, Integer version){
		this.index = index;
		this.protocolVersion  = version;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public Integer getSleepyProtocolVersion() {
		return protocolVersion;
	}
	public static SleepyProtocolVersion getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return V1;
			case 1: return V2;
			default: return null;
		}
	}
	
	public String getValue() {
		return this.name();
	}
	private String label;
	public String getLabel() {
		return label;
	}
	
	private String description;
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return this.toString();
	}

}