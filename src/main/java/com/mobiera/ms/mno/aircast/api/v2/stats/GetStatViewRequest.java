package com.mobiera.ms.mno.aircast.api.v2.stats;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;
import com.mobiera.ms.commons.stats.api.StatEnum;
import com.mobiera.ms.commons.stats.api.StatGranularity;
import com.mobiera.ms.commons.stats.api.StatResultType;

@JsonDeserialize(using = GetStatViewRequestDeserializer.class)
@JsonInclude(Include.NON_NULL)
public class GetStatViewRequest implements Serializable
{
	
	
	private static final long serialVersionUID = 1241060034966633284L;
	
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant from;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant to;
	private List<Long> entityFks;
	private String statClass;
	@JsonIgnore
	private StatGranularity statGranularity;
	private StatResultType statResultType;
	//@JsonDeserialize(using = StatEnumsDeserializer.class)
	//@JsonSerialize(using = StatEnumsSerializer.class)
	private List<StatEnum> statEnums;
	
	public final Instant getFrom() {
		return from;
	}
	public final void setFrom(Instant from) {
		this.from = from;
	}
	public final Instant getTo() {
		return to;
	}
	public final void setTo(Instant to) {
		this.to = to;
	}
	public final List<Long> getEntityFks() {
		return entityFks;
	}
	public final void setEntityFks(List<Long> entityFks) {
		this.entityFks = entityFks;
	}
	
	
	public final StatResultType getStatResultType() {
		return statResultType;
	}
	public final void setStatResultType(StatResultType statResultType) {
		this.statResultType = statResultType;
	}
	public final String getStatClass() {
		return statClass;
	}
	public final void setStatClass(String statClass) {
		this.statClass = statClass;
	}
	public final List<StatEnum> getStatEnums() {
		return statEnums;
	}
	public final void setStatEnums(List<StatEnum> statEnums) {
		this.statEnums = statEnums;
	}
	public StatGranularity getStatGranularity() {
		return statGranularity;
	}
	public void setStatGranularity(StatGranularity statGranularity) {
		this.statGranularity = statGranularity;
	}
	
	
	
	
}
