package com.mobiera.ms.mno.aircast.stats;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum EndpointStat implements StatEnum {

	DATE_TS(-1, "Date", "Date of Stat", true),
	SPOOLED(0, "Spooled", "Notification spooled for Endpoint", true),
	DELIVERY_ATTEMPT(1, "Delivery Attempt", "Service attempted to call Endpoint remote URL", true),
	DELIVERY_OK(2, "Delivery OK", "Service called remote URL and delivery was successful", true),
	DELIVERY_ERROR(3, "Delivery Error", "Service called remote URL and delivery was unsuccessful", true),
	DELIVERY_TRANSPORT_ERROR(4, "Delivery Transport Error", "Service could not connect to remote URL", false),
	DELIVERY_SOFTWARE_ERROR(5, "Delivery Software Error", "Remote Service answered an error. Delivery will be reattempted later", false);
	
	
	private Boolean showByDefault;
	
	private EndpointStat(Integer index, String label, String description, Boolean showByDefault){
		this.index = index;
		this.label = label;
		this.description = description;
		this.showByDefault = showByDefault;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
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
	
	public boolean isShowByDefault() {
		return showByDefault;
	}
	
	public static EndpointStat getEnum(Integer index){
		if (index == null)
	return null;
		
		switch(index){
			case -1: return DATE_TS;
			case 0: return SPOOLED;
			case 1: return DELIVERY_ATTEMPT;
			case 2: return DELIVERY_OK;
			case 3: return DELIVERY_ERROR;
			case 4: return DELIVERY_TRANSPORT_ERROR;
			case 5: return DELIVERY_SOFTWARE_ERROR;
			
			default: return null;
		}
	}

}