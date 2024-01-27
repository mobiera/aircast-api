package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SleepyFlowType implements Serializable {

	RESIDENT(0),PUSH(1);

	private SleepyFlowType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SleepyFlowType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return RESIDENT;
			case 1: return PUSH;
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