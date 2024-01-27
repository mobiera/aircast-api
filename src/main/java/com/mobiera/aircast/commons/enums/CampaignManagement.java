package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum CampaignManagement implements Serializable {

	PERMANENT(0),TRIGGERED(1),SCHEDULED(2), API(3);

	private CampaignManagement(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static CampaignManagement getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return PERMANENT;
			case 1: return TRIGGERED;
			case 2: return SCHEDULED;
			case 3: return API;
			
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