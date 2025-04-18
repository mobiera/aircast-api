package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AppletImpl;
import com.mobiera.ms.mno.api.enums.MessageType;

@JsonInclude(Include.NON_NULL)
public class Mms implements Serializable {

	private static final long serialVersionUID = 7960755744857629469L;
	
	
	private String subject;
	private String textMsg;
	private Boolean dlrRequested;
	private Long validityPeriod;
	
	private Long requestId;
	private Long campaignId;
	private Long campaignScheduleId;
	private Long endpointId;
	
	
	private List<MmsMedia> medias;
	
	private String serviceTpda;
	private String to;
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getServiceTpda() {
		return serviceTpda;
	}
	public void setServiceTpda(String serviceTpda) {
		this.serviceTpda = serviceTpda;
	}
	
	public List<MmsMedia> getMedias() {
		return medias;
	}
	public void setMedias(List<MmsMedia> medias) {
		this.medias = medias;
	}
	public Boolean getDlrRequested() {
		return dlrRequested;
	}
	public void setDlrRequested(Boolean dlrRequested) {
		this.dlrRequested = dlrRequested;
	}
	public Long getValidityPeriod() {
		return validityPeriod;
	}
	public void setValidityPeriod(Long validityPeriod) {
		this.validityPeriod = validityPeriod;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTextMsg() {
		return textMsg;
	}
	public void setTextMsg(String textMsg) {
		this.textMsg = textMsg;
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
	public Long getCampaignScheduleId() {
		return campaignScheduleId;
	}
	public void setCampaignScheduleId(Long campaignScheduleId) {
		this.campaignScheduleId = campaignScheduleId;
	}
	public Long getEndpointId() {
		return endpointId;
	}
	public void setEndpointId(Long endpointId) {
		this.endpointId = endpointId;
	}
	
	
	
	
}
