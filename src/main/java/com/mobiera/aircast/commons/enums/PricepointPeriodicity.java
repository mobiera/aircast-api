package com.mobiera.aircast.commons.enums;

import java.io.Serializable;

public enum PricepointPeriodicity implements Serializable {

	NONE(0),DAY(1),WEEK(2),MONTH(3),EACH_TWO_DAY(4), QUARTER(5), YEAR(6);

	private PricepointPeriodicity(Integer index){
		this.index = index;
	}

	private Integer index;

	public Integer getIndex(){
		return this.index;
	}

	public static PricepointPeriodicity getEnum(Integer index){
		if (index == null)
	return null;

		switch(index){
			case 0: return NONE;
			case 1: return DAY;
			case 2: return WEEK;
			case 3: return MONTH;
			case 4: return EACH_TWO_DAY;
			case 5: return QUARTER;
			case 6: return YEAR;
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