package com.mobiera.aircast.api.vo.stats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.CampaignType;

@JsonInclude(Include.NON_NULL)
public class ScheduledStatVO implements Serializable {

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -8651480573091155934L;
	
	private Long campaignId;
	private CampaignType type;
	private String campaignName;
	
	private Long sent = 0l;
	private Long delivered = 0l;
	private Long executed = 0l;
	private Long pa = 0l;
	private Float ctr = 0f;
	
	private Integer hour;

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public CampaignType getType() {
		return type;
	}

	public void setType(CampaignType type) {
		this.type = type;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Long getSent() {
		return sent;
	}

	public void setSent(Long sent) {
		this.sent = sent;
	}

	public Long getDelivered() {
		return delivered;
	}

	public void setDelivered(Long delivered) {
		this.delivered = delivered;
	}

	public Long getExecuted() {
		return executed;
	}

	public void setExecuted(Long executed) {
		this.executed = executed;
	}

	public Long getPa() {
		return pa;
	}

	public void setPa(Long pa) {
		this.pa = pa;
	}

	public Float getCtr() {
		return ctr;
	}

	public void setCtr(Float ctr) {
		this.ctr = ctr;
	}
	
	
	
}
