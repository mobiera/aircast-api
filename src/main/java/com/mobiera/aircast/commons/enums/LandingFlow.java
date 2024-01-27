package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum LandingFlow implements Serializable {

	OTP(0),FORCE_OTP(1),
	HE(2),NONE(3)
	;

	private LandingFlow(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static LandingFlow getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return OTP;
			case 1: return FORCE_OTP;
			case 2: return HE;
			case 3: return NONE;
			
			
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