package com.mobiera.aircast.commons.enums;

public enum UserIdType {
	
	
	MSISDN(0),ACR(1), MNO_ACR(2);

	private UserIdType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static UserIdType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return MSISDN;
			case 1: return ACR;
			case 2: return MNO_ACR;
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
