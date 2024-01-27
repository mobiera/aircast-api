package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum HistoryType implements Serializable {

	RUN_DATA(0);

	private HistoryType(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static HistoryType getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return RUN_DATA;
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