package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum LandingType implements Serializable {

	AUTH(0),AUTHZ(1);

	private LandingType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static LandingType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return AUTH;
			case 1: return AUTHZ;
			
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