package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum AltTriggeredAction implements Serializable {

	SET_SIM_ALT_AD_ALLOWED_TO_TRUE(0),
	SET_SIM_ALT_AD_ALLOWED_TO_FALSE(1);
	
	private AltTriggeredAction(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static AltTriggeredAction getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return SET_SIM_ALT_AD_ALLOWED_TO_TRUE;
			case 1: return SET_SIM_ALT_AD_ALLOWED_TO_FALSE;
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