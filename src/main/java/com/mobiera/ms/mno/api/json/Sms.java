package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AppletImpl;
import com.mobiera.ms.mno.api.enums.MessageType;

@JsonInclude(Include.NON_NULL)
public class Sms implements Serializable, Event {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7960755744857629469L;
	
	
	private String offerId;
	private String userTpda;
	private String userAcr;
	private String userId;
	private String customParam;
	private String tpNotifParam;
	private String smppAccount; // smppAccount
	private String endpoint; // endpoint
	private String campaign; // campaign
	private Long pricepoint;
	private String requestId; // tp requestId
	private String adId;
	private String campaignScheduleId;
	private Boolean test;
	private Instant ts;
	
	
	
	private String id;
	private String textMessage;
	private String serviceTpda;
	private String returnPathTpda;
	private byte[] binaryMessage;
	private Byte dcs;
	private Byte pid;
	private Byte esmClass;
	//private Instant ts;
	private String serviceType;
	private Boolean dlrRequested;
	private Long validityPeriod;
	private Boolean flashSms;
	//private String tar;
	private Boolean session;
	private Integer priority;
	private MessageType messageType;
	private AppletImpl appletImpl;
	private byte[] sleepyRandom;
	
	private Integer packetSize;
	
	private Boolean nativeApi;
	
	private Long vaServiceFk = null;
	
	public String getTextMessage() {
		return textMessage;
	}
	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	
	public byte[] getBinaryMessage() {
		return binaryMessage;
	}
	public void setBinaryMessage(byte[] binaryMessage) {
		this.binaryMessage = binaryMessage;
	}
	
	/*public Instant getTs() {
		return ts;
	}
	public void setTs(Instant ts) {
		this.ts = ts;
	}*/
	
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
	public Byte getDcs() {
		return dcs;
	}
	public void setDcs(Byte dcs) {
		this.dcs = dcs;
	}
	public Byte getPid() {
		return pid;
	}
	public void setPid(Byte pid) {
		this.pid = pid;
	}
	public Byte getEsmClass() {
		return esmClass;
	}
	public void setEsmClass(Byte esmClass) {
		this.esmClass = esmClass;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public Boolean getDlrRequested() {
		return dlrRequested;
	}
	public void setDlrRequested(Boolean dlrRequested) {
		this.dlrRequested = dlrRequested;
	}
	
	public Boolean getFlashSms() {
		return flashSms;
	}
	public void setFlashSms(Boolean flashSms) {
		this.flashSms = flashSms;
	}
	
	public Boolean getSession() {
		return session;
	}
	public void setSession(Boolean session) {
		this.session = session;
	}
	
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public MessageType getMessageType() {
		return messageType;
	}
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
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
	public AppletImpl getAppletImpl() {
		return appletImpl;
	}
	public void setAppletImpl(AppletImpl appletImpl) {
		this.appletImpl = appletImpl;
	}
	public String getReturnPathTpda() {
		return returnPathTpda;
	}
	public void setReturnPathTpda(String returnPathTpda) {
		this.returnPathTpda = returnPathTpda;
	}
	public Integer getPacketSize() {
		return packetSize;
	}
	public void setPacketSize(Integer packetSize) {
		this.packetSize = packetSize;
	}
	public Boolean getNativeApi() {
		return nativeApi;
	}
	public void setNativeApi(Boolean nativeApi) {
		this.nativeApi = nativeApi;
	}
	public byte[] getSleepyRandom() {
		return sleepyRandom;
	}
	public void setSleepyRandom(byte[] sleepyRandom) {
		this.sleepyRandom = sleepyRandom;
	}
	public Long getValidityPeriod() {
		return validityPeriod;
	}
	public void setValidityPeriod(Long validityPeriod) {
		this.validityPeriod = validityPeriod;
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
	public Long getVaServiceFk() {
		return vaServiceFk;
	}
	public void setVaServiceFk(Long vaServiceFk) {
		this.vaServiceFk = vaServiceFk;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
