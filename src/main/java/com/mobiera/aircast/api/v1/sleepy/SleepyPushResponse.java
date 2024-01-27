package com.mobiera.aircast.api.v1.sleepy;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.sleepy.response.SleepyResponse;

@JsonInclude(Include.NON_NULL)
public class SleepyPushResponse implements Serializable
{
	private static final long serialVersionUID = 5241060034966633233L;
	private SleepyResponse sleepyResponse;
	private Long requestId;
	private Long campaignId;
	private String msisdn;
	private SleepyPushResponseResult result;
	private Boolean testing;
	private String customParam;
	
	public SleepyResponse getSleepyResponse() {
		return sleepyResponse;
	}
	public void setSleepyResponse(SleepyResponse sleepyResponse) {
		this.sleepyResponse = sleepyResponse;
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
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public SleepyPushResponseResult getResult() {
		return result;
	}
	public void setResult(SleepyPushResponseResult result) {
		this.result = result;
	}
	public Boolean getTesting() {
		return testing;
	}
	public void setTesting(Boolean testing) {
		this.testing = testing;
	}
	public String getCustomParam() {
		return customParam;
	}
	public void setCustomParam(String customParam) {
		this.customParam = customParam;
	}
	
	
	
}
