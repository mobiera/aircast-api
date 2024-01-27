package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.mno.api.enums.DlrStatus;
import com.mobiera.ms.mno.api.enums.MessageType;

@JsonInclude(Include.NON_NULL)
public class Dlr implements Serializable, Event {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7960755744857629469L;
	
	
	private String offerId;
	private String userTpda;
	private String userAcr;
	private String customParam;
	private String tpNotifParam;
	private String smppAccount; // smppAccount
	private String endpoint; // endpoint
	private String campaign; // campaign
	private String requestId; // tp requestId
	private Long pricepoint;
	private String adId;
	private String campaignScheduleId;
	private Boolean test;
	private Instant ts;
	
	private Boolean nativeApi;
	
	
	
	private String id;
	private DlrStatus status;
	private String serviceTpda;
	private MessageType messageType;
	
	public DlrStatus getStatus() {
		return status;
	}
	public void setStatus(DlrStatus status) {
		this.status = status;
	}
	public String getServiceTpda() {
		return serviceTpda;
	}
	public void setServiceTpda(String serviceTpda) {
		this.serviceTpda = serviceTpda;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getUserTpda() {
		return userTpda;
	}
	public void setUserTpda(String userTpda) {
		this.userTpda = userTpda;
	}
	public String getUserAcr() {
		return userAcr;
	}
	public void setUserAcr(String userAcr) {
		this.userAcr = userAcr;
	}
	public String getCustomParam() {
		return customParam;
	}
	public void setCustomParam(String customParam) {
		this.customParam = customParam;
	}
	public String getTpNotifParam() {
		return tpNotifParam;
	}
	public void setTpNotifParam(String tpNotifParam) {
		this.tpNotifParam = tpNotifParam;
	}
	
	public Boolean getTest() {
		return test;
	}
	public void setTest(Boolean test) {
		this.test = test;
	}
	public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}
	public String getSmppAccount() {
		return smppAccount;
	}
	public void setSmppAccount(String smppAccount) {
		this.smppAccount = smppAccount;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public String getCampaign() {
		return campaign;
	}
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public MessageType getMessageType() {
		return messageType;
	}
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
	public Boolean getNativeApi() {
		return nativeApi;
	}
	public void setNativeApi(Boolean nativeApi) {
		this.nativeApi = nativeApi;
	}
	public String getAdId() {
		return adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getCampaignScheduleId() {
		return campaignScheduleId;
	}
	public void setCampaignScheduleId(String campaignScheduleId) {
		this.campaignScheduleId = campaignScheduleId;
	}
	public Long getPricepointId() {
		return pricepoint;
	}
	public void setPricepointId(Long pricepoint) {
		this.pricepoint = pricepoint;
	}
	
	
	

}
