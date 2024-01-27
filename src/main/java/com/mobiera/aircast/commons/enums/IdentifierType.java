package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum IdentifierType implements Serializable {

	SIM(0),PM(1), LANDING_HE(2), KEYWORD(3), LANDING_OTP(4);

	private IdentifierType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static IdentifierType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return SIM;
			case 1: return PM;
			case 2: return LANDING_HE;
			case 3: return KEYWORD;
			case 4: return LANDING_OTP;
			
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