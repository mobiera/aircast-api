package com.mobiera.aircast.api.vo.stats;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.CampaignType;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class VasStatVO implements Serializable {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -8651480573091155934L;
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant ts;
	private Integer day;
	
	private Long entityId;
	private String entityName;
	
	private Long subscribed = 0l;
	private Long unsubscribed = 0l;
	private Double charged = 0d;
	public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public Long getSubscribed() {
		return subscribed;
	}
	public void setSubscribed(Long subscribed) {
		this.subscribed = subscribed;
	}
	public Long getUnsubscribed() {
		return unsubscribed;
	}
	public void setUnsubscribed(Long unsubscribed) {
		this.unsubscribed = unsubscribed;
	}
	public Double getCharged() {
		return charged;
	}
	public void setCharged(Double charged) {
		this.charged = charged;
	}
	
	
	
}
