package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SimIdentifier implements Serializable {

	ICCID(0),IMSI(1);

	private SimIdentifier(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SimIdentifier getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return ICCID;
			case 1: return IMSI;
			//case 2: return MSISDN;
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