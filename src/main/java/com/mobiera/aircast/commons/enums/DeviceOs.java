package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum DeviceOs implements Serializable {

	ANDROID(0), IOS(1), WINDOWS_PHONE(2), BLACKBERRY(3), SYMBIAN(4), OTHER(5), UNKNOWN(6);

	private DeviceOs(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static DeviceOs getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return ANDROID;
			case 1: return IOS;
			case 2: return WINDOWS_PHONE;
			case 3: return BLACKBERRY;
			case 4: return SYMBIAN;
			case 5: return OTHER;
			case 6: return UNKNOWN;
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