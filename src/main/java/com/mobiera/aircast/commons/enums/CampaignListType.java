package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum CampaignListType implements Serializable {

	FULL_DB(0),
	FULL_DB_WITH_BLACK_LISTS(1),
	WHITE_LISTS(2),
	WHITE_AND_BLACK_LISTS(3),
	CUSTOM_USER_DATA_SINGLE_LIST(4);

	private CampaignListType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static CampaignListType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return FULL_DB;
			case 1: return FULL_DB_WITH_BLACK_LISTS;
			case 2: return WHITE_LISTS;
			case 3: return WHITE_AND_BLACK_LISTS;
			case 4: return CUSTOM_USER_DATA_SINGLE_LIST;
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