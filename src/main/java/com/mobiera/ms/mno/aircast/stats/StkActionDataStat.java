package com.mobiera.ms.mno.aircast.stats;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum StkActionDataStat implements StatEnum {

	DATE_TS(-1, "Date", "Date of Stat", true),
	VIEW(0, "View", "View", true),
	OK(1, "OK", "OK", true),
	BACK(2, "Back", "Back", true),
	CANCEL(3, "Cancel", "Cancel", true),
	TIMEOUT(4, "Timeout", "Timeout", true),
	ERROR(5, "Error", "Error", true);
	
	
	private Boolean showByDefault;
	
	private StkActionDataStat(Integer index, String label, String description, Boolean showByDefault){
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
	
	public static StkActionDataStat getEnum(Integer index){
		if (index == null)
	return null;
		
		switch(index){
			case -1: return DATE_TS;
			case 0: return VIEW;
			case 1: return OK;
			case 2: return BACK;
			case 3: return CANCEL;
			case 4: return TIMEOUT;
			case 5: return ERROR;
			default: return null;
		}
	}

}