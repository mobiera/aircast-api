package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SleepyCipheringMode implements Serializable {

	ALWAYS(0),NEVER(1),CUSTOM(2);

	private SleepyCipheringMode(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SleepyCipheringMode getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return ALWAYS;
			case 1: return NEVER;
			case 2: return CUSTOM;
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