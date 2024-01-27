package com.mobiera.ms.mno.aircast.stats;

import com.mobiera.ms.commons.stats.api.StatEnum;

public enum CampaignScheduleStat implements StatEnum {

	DATE_TS(-1, "Date", "Date of Stat", true),
	VIEWED_1(0, "Viewed 1", "Viewed 1", true),
	OK_1(1, "Ok 1", "Ok 1", true),
	CANCEL_1(2, "Cancel 1", "Cancel 1", true),
	BACK_1(3, "Back 1", "Back 1", true),
	TIMEOUT_1(4, "Timeout 1", "Timeout 1", true),
	ERROR_1(5, "Error 1", "Error 1", false),
	VIEWED_2(6, "Viewed 2", "Viewed 2", true),
	OK_2(7, "Ok 2", "Ok 2", true),
	CANCEL_2(8, "Cancel 2", "Cancel 2", true),
	BACK_2(9, "Back 2", "Back 2", true),
	TIMEOUT_2(10, "Timeout 2", "Timeout 2", true),
	ERROR_2(11, "Error 2", "Error 2", false),
	SENT(12, "Sent", "Sent", false),
	DLRED(13, "Dlred", "Dlred", false),
	
	
	;
	private Boolean showByDefault;
	
	private CampaignScheduleStat(Integer index, String label, String description, Boolean showByDefault){
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
	
	public static CampaignScheduleStat getEnum(Integer index){
		if (index == null)
	return null;
		
		switch(index){
			case -1: return DATE_TS;
			case 0: return VIEWED_1;
			case 1: return OK_1;
			case 2: return CANCEL_1;
			case 3: return BACK_1;
			case 4: return TIMEOUT_1;
			case 5: return ERROR_1;
			case 6: return VIEWED_2;
			case 7: return OK_2;
			case 8: return CANCEL_2;
			case 9: return BACK_2;
			case 10: return TIMEOUT_2;
			case 11: return ERROR_2;
			case 12: return SENT	;
			case 13: return DLRED;
			
			default: return null;
		}
	}

}