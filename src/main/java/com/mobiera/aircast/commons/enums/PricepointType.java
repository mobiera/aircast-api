package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum PricepointType implements Serializable {

	VIETTEL_MPS(0,"Viettel Mps","Viettel Mps" ),
	GENERIC(1,"Generic","Generic" ),
	
	;
	
	private PricepointType(Integer index, String label, String description){
		this.index = index;
		this.label = label;
		this.description = description;
		
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static PricepointType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
		case 0: return VIETTEL_MPS;
		case 1: return GENERIC;
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