package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum SessionStatus implements Serializable {

	SUCCESS(0),WAITING(1),TEMP_ERROR(2), FATAL_ERROR(3),
	PENDING(4), NOT_STARTED(5), DEAD_SIM(6), DISABLED_PROFILE(7),
	SUCCESS_DEAD_SIM(8), ENCRYPTION_ERROR(9), FORWARDING(10), EXCLUDED(11), PENDING_UNIT_TEST(12);

	private SessionStatus(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SessionStatus getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return SUCCESS;
			case 1: return WAITING;
			case 2: return TEMP_ERROR;
			case 3: return FATAL_ERROR;
			case 4: return PENDING;
			case 5: return NOT_STARTED;
			case 6: return DEAD_SIM;
			case 7: return DISABLED_PROFILE;
			case 8: return SUCCESS_DEAD_SIM;
			case 9: return ENCRYPTION_ERROR;
			case 10: return FORWARDING;
			case 11: return EXCLUDED;
			case 12: return PENDING_UNIT_TEST;
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