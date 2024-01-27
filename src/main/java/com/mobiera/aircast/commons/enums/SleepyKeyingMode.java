package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SleepyKeyingMode implements Serializable {

	KEY_DIVERSIFICATION(0),KEY_DIVERSIFICATION_RANDOM(1),PRESHARED_KEY(2), NO_CIPHERING(3);

	private SleepyKeyingMode(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SleepyKeyingMode getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return KEY_DIVERSIFICATION;
			case 1: return KEY_DIVERSIFICATION_RANDOM;
			case 2: return PRESHARED_KEY;
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