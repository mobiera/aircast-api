package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum ResourceLoad implements Serializable {

	LOW(0),MEDIUM(1),HIGH(2),CRITICAL(3);

	private ResourceLoad(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static ResourceLoad getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return LOW;
			case 1: return MEDIUM;
			case 2: return HIGH;
			case 3: return CRITICAL;
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