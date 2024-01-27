package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum IdentifierAction implements Serializable {

	SUBSCRIBE(0),UNSUBSCRIBE(1), ONESHOT(2);

	private IdentifierAction(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static IdentifierAction getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return SUBSCRIBE;
			case 1: return UNSUBSCRIBE;
			case 2: return ONESHOT;
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