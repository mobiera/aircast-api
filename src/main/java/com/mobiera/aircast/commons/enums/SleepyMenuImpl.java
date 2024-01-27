package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SleepyMenuImpl implements Serializable {

	NONE(0), MENU_ENTRIES(1),RESIDENT_DATA(2);

	private SleepyMenuImpl(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SleepyMenuImpl getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
		case 0: return NONE;
		case 1: return MENU_ENTRIES;
		case 2: return RESIDENT_DATA;
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