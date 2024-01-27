package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum AckType implements Serializable {

	POR(0),SMSC_DLR(1), NONE(2);

	private AckType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static AckType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return POR;
			case 1: return SMSC_DLR;
			case 2: return NONE;
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