package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SimDiscoveryPolicy implements Serializable {
// SET_DEFAULT_PROFILE_AND_DISCOVER
	BLOCK(0),SET_DEFAULT_PROFILE_AND_DISCOVER(1), SET_DEFAULT_PROFILE(2);

	private SimDiscoveryPolicy(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SimDiscoveryPolicy getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return BLOCK;
			case 1: return SET_DEFAULT_PROFILE_AND_DISCOVER;
			case 2: return SET_DEFAULT_PROFILE;
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