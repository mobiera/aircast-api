package com.mobiera.aircast.commons.enums.statsold;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum ActionTriggerStat implements StatEnum {

	DATE_TS(-1, "Date", true),
	MATCH(0, "Match", true);
	
	
	private Boolean showByDefault;
	
	public Boolean isShowByDefault() {
		return showByDefault;
	}
	private ActionTriggerStat(Integer index, String label, Boolean showByDefault){
		this.index = index;
		this.label = label;
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
	public static ActionTriggerStat getEnum(Integer index){
		if (index == null)
	return null;
		
		switch(index){
		
			case -1: return DATE_TS;
			case 0: return MATCH;
			
			
			default: return null;
		}
	}

}