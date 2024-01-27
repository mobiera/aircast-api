package com.mobiera.aircast.api.v1.ustk;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonInclude(Include.NON_NULL)
@JsonTypeInfo(use = Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
@Type(value = TextRequest.class),
@Type(value = MenuRequest.class),
@Type(value = UrlRequest.class),
@Type(value = CallRequest.class),
@Type(value = UssdRequest.class),
@Type(value = MoRequest.class),
})

public abstract class UstkRequest implements Serializable
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	public static final String TEXT_REQUEST = "T";
	public static final String MENU_REQUEST = "M";
	public static final String URL_REQUEST = "U";
	public static final String CALL_REQUEST = "C";
	public static final String USSD_REQUEST = "S";
	public static final String MO_REQUEST = "O";
	public static final String DISCOVERY_REQUEST ="D";
	
	private String msisdn;
	private String iccid;
	private String imsi;
	private Long requestId;
	private Long campaignId;
	private String customParam;
	private Boolean requestDeliveryReport;
	private Long adId;
	private Long campaignScheduleId;
	
	private Boolean testing;
	
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
	public Boolean getRequestDeliveryReport() {
		return requestDeliveryReport;
	}
	public void setRequestDeliveryReport(Boolean requestDeliveryReport) {
		this.requestDeliveryReport = requestDeliveryReport;
	}
	
	
	
	@JsonIgnore
	public String getOptionalParam() {
		return null;
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
	public Long getCampaignScheduleId() {
		return campaignScheduleId;
	}
	public void setCampaignScheduleId(Long campaignScheduleId) {
		this.campaignScheduleId = campaignScheduleId;
	}
	
	
	
	
	
}
