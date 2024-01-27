package com.mobiera.ms.mno.aircast.api.v1.stats;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mobiera.ms.commons.stats.api.StatEnum;
import com.mobiera.ms.commons.stats.api.StatGranularity;
import com.mobiera.ms.commons.stats.api.StatResultType;
import com.mobiera.ms.mno.aircast.stats.AircastStatClass;

@JsonDeserialize(using = GetStatViewRequestDeserializer.class)
@JsonInclude(Include.NON_NULL)
public class GetStatViewRequest implements Serializable
{
	
	
	private static final long serialVersionUID = 1241060034966633284L;
	
	
	private Date from;
	private Date to;
	private List<Long> entityFks;
	private AircastStatClass statClass;
	private StatGranularity statGranularity;
	private StatResultType statResultType;
	private List<StatEnum> statEnums;
	
	public final Date getFrom() {
		return from;
	}
	public final void setFrom(Date from) {
		this.from = from;
	}
	public final Date getTo() {
		return to;
	}
	public final void setTo(Date to) {
		this.to = to;
	}
	public final List<Long> getEntityFks() {
		return entityFks;
	}
	public final void setEntityFks(List<Long> entityFks) {
		this.entityFks = entityFks;
	}
	
	public final StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public final void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	
	public final StatResultType getStatResultType() {
		return statResultType;
	}
	public final void setStatResultType(StatResultType statResultType) {
		this.statResultType = statResultType;
	}
	public final AircastStatClass getStatClass() {
		return statClass;
	}
	public final void setStatClass(AircastStatClass statClass) {
		this.statClass = statClass;
	}
	public final List<StatEnum> getStatEnums() {
		return statEnums;
	}
	public final void setStatEnums(List<StatEnum> statEnums) {
		this.statEnums = statEnums;
	}
	
	
	
	
}
