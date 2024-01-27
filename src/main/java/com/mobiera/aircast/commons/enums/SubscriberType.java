package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SubscriberType implements Serializable {
	INDIVIDUAL(0),MNO_EMPLOYEE(1),CORPORATE(2),UNKNOWN(3);

	private SubscriberType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SubscriberType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return INDIVIDUAL;
			case 1: return MNO_EMPLOYEE;
			case 2: return CORPORATE;
			case 3: return UNKNOWN;
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