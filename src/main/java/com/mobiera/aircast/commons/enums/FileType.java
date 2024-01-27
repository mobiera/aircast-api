package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum FileType implements Serializable {

	LIST(0),APPLET(1), CUSTOM_LIST(2), ADVERTISING_CAMPAIGNS(3);

	private FileType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static FileType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return LIST;
			case 1: return APPLET;
			case 2: return CUSTOM_LIST;
			case 3: return ADVERTISING_CAMPAIGNS;
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