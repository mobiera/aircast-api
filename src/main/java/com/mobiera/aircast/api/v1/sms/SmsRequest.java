package com.mobiera.aircast.api.v1.sms;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.mobiera.aircast.commons.enums.Dcs;

@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = TextSmsRequest.class),
@Type(value = BinarySmsRequest.class),
})
@JsonInclude(Include.NON_NULL)
public abstract class SmsRequest implements Serializable
{
	private static final long serialVersionUID = 1241060010966633233L;
	private Long requestId;
	private String msisdn;
	private String iccid;
	private String imsi;
	private Dcs dcs;
	private Long campaignId;
	private Long campaignScheduleId;
	
	
	private Boolean dlr;
	private Boolean requestDeliveryReport;
	
	private Boolean testing;
	
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
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
	
	public Dcs getDcs() {
		return dcs;
	}
	public void setDcs(Dcs dcs) {
		this.dcs = dcs;
	}
	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	@Deprecated
	public Boolean getDlr() {
		return dlr;
	}
	@Deprecated
	public void setDlr(Boolean dlr) {
		this.dlr = dlr;
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
	public Long getCampaignScheduleId() {
		return campaignScheduleId;
	}
	public void setCampaignScheduleId(Long campaignScheduleId) {
		this.campaignScheduleId = campaignScheduleId;
	}
	
	
	

	
	
}
