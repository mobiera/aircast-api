package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum UploadedListType implements Serializable {

	WHITE_LIST(0),
	BLACK_LIST(1),
	CUSTOM_WITH_USER_DATA_LIST(2);
	
	private UploadedListType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static UploadedListType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return WHITE_LIST;
			case 1: return BLACK_LIST;
			case 2: return CUSTOM_WITH_USER_DATA_LIST;
			
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