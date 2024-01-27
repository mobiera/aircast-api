package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SubscriberPlan implements Serializable {

	PREPAID(0),POSTPAID(1), CONTROL(2), UNKNOWN(3), 
	CUSTOM_PLAN_4(4), 
	CUSTOM_PLAN_5(5), 
	CUSTOM_PLAN_6(6),
	CUSTOM_PLAN_7(7),
	CUSTOM_PLAN_8(8),
	CUSTOM_PLAN_9(9),
	CUSTOM_PLAN_10(10),
	CUSTOM_PLAN_11(11),
	CUSTOM_PLAN_12(12),
	CUSTOM_PLAN_13(13),
	CUSTOM_PLAN_14(14),
	CUSTOM_PLAN_15(15);
	

	private SubscriberPlan(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SubscriberPlan getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return PREPAID;
			case 1: return POSTPAID;
			case 2: return CONTROL;
			case 3: return UNKNOWN;
			case 4: return CUSTOM_PLAN_4;
			case 5: return CUSTOM_PLAN_5;
			case 6: return CUSTOM_PLAN_6;
			case 7: return CUSTOM_PLAN_7;
			case 8: return CUSTOM_PLAN_8;
			case 9: return CUSTOM_PLAN_9;
			case 10: return CUSTOM_PLAN_10;
			case 11: return CUSTOM_PLAN_11;
			case 12: return CUSTOM_PLAN_12;
			case 13: return CUSTOM_PLAN_13;
			case 14: return CUSTOM_PLAN_14;
			case 15: return CUSTOM_PLAN_15;
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