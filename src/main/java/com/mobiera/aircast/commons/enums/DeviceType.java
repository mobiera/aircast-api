package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum DeviceType implements Serializable {

	PHONE(0), TABLET(1), WATCH(2), MODEM(3), UNKNOWN(4), OTHER(5);

	private DeviceType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static DeviceType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return PHONE;
			case 1: return TABLET;
			case 2: return WATCH;
			case 3: return MODEM;
			case 4: return UNKNOWN;
			case 5: return OTHER;
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