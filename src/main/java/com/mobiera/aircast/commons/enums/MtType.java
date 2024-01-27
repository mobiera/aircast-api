package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum MtType implements Serializable {

	PING(0),DATA(1);

	private MtType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static MtType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return PING;
			case 1: return DATA;
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