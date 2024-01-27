package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum Dlr implements Serializable {

	DELIVERED(0),UNDELIVERED(1), SENT(2);

	private Dlr(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static Dlr getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return DELIVERED;
			case 1: return UNDELIVERED;
			case 2: return SENT;
			default: return null;
		}
	}

}