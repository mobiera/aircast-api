package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.commons.stats.api.StatEnum;
import com.mobiera.ms.mno.aircast.stats.AircastStatClass;

@JsonInclude(Include.NON_NULL)
public class KpiVO implements Serializable {

	private static final long serialVersionUID = 4829416845298862375L;

	private Long entityFk;
	private AircastStatClass statClass;
	private StatEnum statEnum;
	private String label;
	
	public Long getEntityFk() {
		return entityFk;
	}
	public void setEntityFk(Long entityFk) {
		this.entityFk = entityFk;
	}
	public AircastStatClass getStatClass() {
		return statClass;
	}
	public void setStatClass(AircastStatClass statClass) {
		this.statClass = statClass;
	}
	public StatEnum getStatEnum() {
		return statEnum;
	}
	public void setStatEnum(StatEnum statEnum) {
		this.statEnum = statEnum;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
	
}
