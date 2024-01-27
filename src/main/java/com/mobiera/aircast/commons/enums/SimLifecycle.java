package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SimLifecycle implements Serializable {

	ACTIVE(0),PROVISIONED(1),DELETED(2);

	private SimLifecycle(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SimLifecycle getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return ACTIVE;
			case 1: return PROVISIONED;
			case 2: return DELETED;
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