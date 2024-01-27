package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum AppletPingStatus implements Serializable {

	NOT_SENT(0),SENT(1), OK(2);

	private AppletPingStatus(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static AppletPingStatus getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return NOT_SENT;
			case 1: return SENT;
			case 2: return OK;
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