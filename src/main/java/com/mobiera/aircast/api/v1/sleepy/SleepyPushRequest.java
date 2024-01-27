package com.mobiera.aircast.api.v1.sleepy;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.sleepy.command.ApiSleepyCommand;
import com.mobiera.commons.introspection.Required;

@JsonInclude(Include.NON_NULL)
public class SleepyPushRequest implements Serializable
{
	private static final long serialVersionUID = 5241060034966633233L;
	@Required
	private Long requestId;
	private String msisdn;
	private String iccid;
	private String imsi;
	@Required
	private ApiSleepyCommand sleepyCommand;
	@Required
	private Long campaignId;   
	private Boolean requestDeliveryReport;
	
	private Boolean testing;
	
	private String customParam;
	
	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public ApiSleepyCommand getSleepyCommand() {
		return sleepyCommand;
	}

	public void setSleepyCommand(ApiSleepyCommand sleepyCommand) {
		this.sleepyCommand = sleepyCommand;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Boolean getRequestDeliveryReport() {
		return requestDeliveryReport;
	}

	public void setRequestDeliveryReport(Boolean requestDeliveryReport) {
		this.requestDeliveryReport = requestDeliveryReport;
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
