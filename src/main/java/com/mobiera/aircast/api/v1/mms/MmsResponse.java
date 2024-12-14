package com.mobiera.aircast.api.v1.mms;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.Dlr;

@JsonInclude(Include.NON_NULL)
public class MmsResponse implements Serializable
{
	private static final long serialVersionUID = 5241060034966633233L;
	private Long requestId;
	private Long campaignId;
	private Long campaignScheduleId;
	private Dlr dlr;
	private Boolean testing;
	private String msisdn;
	
	
	public Dlr getDlr() {
		return dlr;
	}
	public void setDlr(Dlr dlr) {
		this.dlr = dlr;
	}
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	public Boolean getTesting() {
		return testing;
	}
	public void setTesting(Boolean testing) {
		this.testing = testing;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Long getCampaignScheduleId() {
		return campaignScheduleId;
	}
	public void setCampaignScheduleId(Long campaignScheduleId) {
		this.campaignScheduleId = campaignScheduleId;
	}
	
	
	
}
