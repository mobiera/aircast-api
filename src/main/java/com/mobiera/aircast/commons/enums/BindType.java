package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum BindType implements Serializable {

	TRANSCEIVER(0),TRANSMITTER(1), RECEIVER(2);

	private BindType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static BindType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return TRANSCEIVER;
			case 1: return TRANSMITTER;
			case 2: return RECEIVER;
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