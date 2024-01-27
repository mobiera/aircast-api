package com.mobiera.aircast.api.v1.simstats;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.CampaignType;
import com.mobiera.aircast.commons.enums.ImpactPolicy;
import com.mobiera.commons.enums.Condition;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;
import com.mobiera.ms.commons.stats.api.StatEnum;
import com.mobiera.ms.commons.stats.api.StatGranularity;
import com.mobiera.ms.commons.stats.api.StatResultType;

@JsonInclude(Include.NON_NULL)
public class ListSimStatVOsRequest implements Serializable
{
	
	
	private static final long serialVersionUID = 1241060034966633284L;
	
	
	private Integer days;


	public Integer getDays() {
		return days;
	}


	public void setDays(Integer days) {
		this.days = days;
	}
	
	
	
	
	
}
