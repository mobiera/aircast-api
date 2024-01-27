package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum TriggeredAction implements Serializable {

	SET_SIM_MNO_AD_ALLOWED_TO_TRUE(0),
	SET_SIM_MNO_AD_ALLOWED_TO_FALSE(1),
	SET_SIM_TP_AD_ALLOWED_TO_TRUE(2),
	SET_SIM_TP_AD_ALLOWED_TO_FALSE(3),
	SET_SIM_AD_ALLOWED_TO_TRUE(4),
	SET_SIM_AD_ALLOWED_TO_FALSE(5),
	ENDPOINT_CALL(6),
	SET_SIM_STATE1_TO_TRUE(7),
	SET_SIM_STATE1_TO_FALSE(8),
	SET_SIM_STATE1_TO_NULL(9),
	SET_SIM_STATE2_TO_TRUE(10),
	SET_SIM_STATE2_TO_FALSE(11),
	SET_SIM_STATE2_TO_NULL(12),
	RUN_CAMPAIGN(13),
	SET_SIM_MNO_AD_ALLOWED_TO_NULL(14),
	SET_SIM_TP_AD_ALLOWED_TO_NULL(15),
	SET_SIM_AD_ALLOWED_TO_NULL(16),
	
	;
	
	private TriggeredAction(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static TriggeredAction getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return SET_SIM_MNO_AD_ALLOWED_TO_TRUE;
			case 1: return SET_SIM_MNO_AD_ALLOWED_TO_FALSE;
			case 2: return SET_SIM_TP_AD_ALLOWED_TO_TRUE;
			case 3: return SET_SIM_TP_AD_ALLOWED_TO_FALSE;
			case 4: return SET_SIM_AD_ALLOWED_TO_TRUE;
			case 5: return SET_SIM_AD_ALLOWED_TO_FALSE;
			case 6: return ENDPOINT_CALL;
			case 7: return SET_SIM_STATE1_TO_TRUE;
			case 8: return SET_SIM_STATE1_TO_FALSE;
			case 9: return SET_SIM_STATE1_TO_NULL;
			case 10: return SET_SIM_STATE2_TO_TRUE;
			case 11: return SET_SIM_STATE2_TO_FALSE;
			case 12: return SET_SIM_STATE2_TO_NULL;
			case 13: return RUN_CAMPAIGN;
			case 14: return SET_SIM_MNO_AD_ALLOWED_TO_NULL;
			case 15: return SET_SIM_TP_AD_ALLOWED_TO_NULL;
			case 16: return SET_SIM_AD_ALLOWED_TO_NULL;
			
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