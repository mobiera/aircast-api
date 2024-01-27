package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum CampaignPriority implements Serializable {

	INTERACTIVE(0),HIGH(1),LOW(2);

	private CampaignPriority(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static CampaignPriority getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return INTERACTIVE;
			case 1: return HIGH;
			case 2: return LOW;
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