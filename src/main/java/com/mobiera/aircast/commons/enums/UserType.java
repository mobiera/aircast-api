package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum UserType implements Serializable {

	OP(0),TP(1), ADMIN(2);

	private UserType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static UserType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return OP;
			case 1: return TP;
			case 2: return ADMIN;
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