package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum CampaignType implements Serializable {

	RAM(0, "OTA_DECIDER", "OTA_PREPARER"),RFM(1, "OTA_DECIDER", "OTA_PREPARER"),
	SLEEPY(2, "OTA_DECIDER", "OTA_PREPARER"), CUSTOM(3, "OTA_DECIDER", "OTA_PREPARER"),
	SLEEPY_API(4, "API_DECIDER", "API_PREPARER"), SMS_API(5, "API_DECIDER", "API_PREPARER"),
	SMS(6, "SMS_DECIDER", "SMS_PREPARER"), AUTH_API(7,"OTA_DECIDER","OTA_DECIDER"),
	RAW(8,"OTA_DECIDER","OTA_DECIDER"), USTK_API(9, "API_DECIDER", "API_PREPARER"),
	DISCOVERY(10,"OTA_DECIDER", "OTA_PREPARER"), USTK(11,"OTA_DECIDER", "OTA_PREPARER"),
	SLEEPY_FLOW(12,"OTA_DECIDER", "OTA_PREPARER"), ADVERTISING(13, "PM_DECIDER", "PM_PREPARER");

	private CampaignType(Integer index, String deciderRoleName, String preparerRoleName){
		this.index = index;
		this.deciderRoleName = deciderRoleName;
		this.preparerRoleName = preparerRoleName;
	}

	private String deciderRoleName;
	private String preparerRoleName;
	
	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static CampaignType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return RAM;
			case 1: return RFM;
			case 2: return SLEEPY;
			case 3: return CUSTOM;
			case 4: return SLEEPY_API;
			case 5: return SMS_API;
			case 6: return SMS;
			case 7: return AUTH_API;
			case 8: return RAW;
			case 9: return USTK_API;
			case 10: return DISCOVERY;
			case 11: return USTK;
			case 12: return SLEEPY_FLOW;
			case 13: return ADVERTISING;
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

	public String getPreparerRoleName() {
		return preparerRoleName;
	}

	public void setPreparerRoleName(String preparerRoleName) {
		this.preparerRoleName = preparerRoleName;
	}
}