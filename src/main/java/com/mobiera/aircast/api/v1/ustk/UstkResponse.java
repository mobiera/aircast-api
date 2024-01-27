package com.mobiera.aircast.api.v1.ustk;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UstkResponse implements Serializable
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	
	private UstkResponseResult result;
	private Long requestId;
	private Long campaignId;
	private Long adId;
	private Long campaignScheduleId;
	
	private String data;
	private String errorMessage;
	private Integer lastActionId;
	private Boolean testing;
	private String customParam;
	private String msisdn;
	
	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public UstkResponseResult getResult() {
		return result;
	}

	public void setResult(UstkResponseResult result) {
		this.result = result;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getLastActionId() {
		return lastActionId;
	}

	public void setLastActionId(Integer lastActionId) {
		this.lastActionId = lastActionId;
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

	public Long getAdId() {
		return adId;
	}

	public void setAdId(Long adId) {
		this.adId = adId;
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
