package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum Por implements Serializable {

	OK(0),ERROR(1);

	private Por(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static Por getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return OK;
			case 1: return ERROR;
			default: return null;
		}
	}

}