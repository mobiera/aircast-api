package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum RamCommand implements Serializable {

	LOAD_AND_INSTALL(0),DELETE(1),LIST(2);

	private RamCommand(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static RamCommand getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return LOAD_AND_INSTALL;
			case 1: return DELETE;
			case 2: return LIST;
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