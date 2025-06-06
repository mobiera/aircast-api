package com.mobiera.aircast.api.v1.mms;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import com.mobiera.ms.mno.api.json.MmsMedia;

@JsonInclude(Include.NON_NULL)
public class MmsRequest implements Serializable
{
	private static final long serialVersionUID = 1241060010966633233L;
	private Long requestId;
	private String msisdn;
	private Long campaignId;
	private Long campaignScheduleId;
	private Boolean requestDeliveryReport;
	private Boolean testing;
	
	private String subject;
	private String textMsg;
	private List<MmsMedia> medias;
	
	private String serviceTpda;
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
	public Boolean getTesting() {
		return testing;
	}
	public void setTesting(Boolean testing) {
		this.testing = testing;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTextMsg() {
		return textMsg;
	}
	public void setTextMsg(String textMsg) {
		this.textMsg = textMsg;
	}
	public List<MmsMedia> getMedias() {
		return medias;
	}
	public void setMedias(List<MmsMedia> medias) {
		this.medias = medias;
	}
	public String getServiceTpda() {
		return serviceTpda;
	}
	public void setServiceTpda(String serviceTpda) {
		this.serviceTpda = serviceTpda;
	}
	
	public Long getCampaignScheduleId() {
		return campaignScheduleId;
	}
	public void setCampaignScheduleId(Long campaignScheduleId) {
		this.campaignScheduleId = campaignScheduleId;
	}
	
	
	
}
