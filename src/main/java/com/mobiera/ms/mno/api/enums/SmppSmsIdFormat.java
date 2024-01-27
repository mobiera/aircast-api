package com.mobiera.ms.mno.api.enums;

import java.io.Serializable;

public enum SmppSmsIdFormat implements Serializable {

	SUBMIT_HEX_DLR_HEX(0),
	SUBMIT_HEX_DLR_LONG(1),
	SUBMIT_LONG_DLR_HEX(2), 
	SUBMIT_LONG_DLR_LONG(3), 
	SUBMIT_STR_DLR_STR(4);

	private SmppSmsIdFormat(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static SmppSmsIdFormat getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return SUBMIT_HEX_DLR_HEX;
			case 1: return SUBMIT_HEX_DLR_LONG;
			case 2: return SUBMIT_LONG_DLR_HEX;
			case 3: return SUBMIT_LONG_DLR_LONG;
			case 4: return SUBMIT_STR_DLR_STR;
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