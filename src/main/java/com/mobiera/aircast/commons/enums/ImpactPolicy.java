package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum ImpactPolicy implements Serializable {

	P0(0),P1(1),P2(2),P3(4),P4(4),P5(5);

	private ImpactPolicy(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static ImpactPolicy getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return P0;
			case 1: return P1;
			case 2: return P2;
			case 3: return P3;
			case 4: return P4;
			case 5: return P5;
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