package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.sleepy.SleepyPushRequest;
import com.mobiera.aircast.api.v1.sleepy.SleepyPushResponse;
import com.mobiera.aircast.commons.enums.AppletImpl;

@JsonInclude(Include.NON_NULL)

public class Sleepy implements Serializable, Event {

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
	private Long pricepoint;
	private String requestId; // tp requestId
	private Boolean test;
	private Instant ts;
	
	
	
	private UUID id;
	private String serviceTpda;
	private Boolean dlrRequested;
	private SleepyPushRequest request;
	private AppletImpl appletImpl;
	private SleepyPushResponse response;
	private Integer lastActionId;
	private byte[] kdr;
	private byte[] key;
	private Long appletFk;
	private Long simProfileFk;
	
	private Boolean checkCampaignExclusions;
	private Boolean checkBrowserExclusions;
	
	private String errorMsg;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getServiceTpda() {
		return serviceTpda;
	}
	public void setServiceTpda(String serviceTpda) {
		this.serviceTpda = serviceTpda;
	}
	public Boolean getDlrRequested() {
		return dlrRequested;
	}
	public void setDlrRequested(Boolean dlrRequested) {
		this.dlrRequested = dlrRequested;
	}
	
	public AppletImpl getAppletImpl() {
		return appletImpl;
	}
	public void setAppletImpl(AppletImpl appletImpl) {
		this.appletImpl = appletImpl;
	}
	
	public Integer getLastActionId() {
		return lastActionId;
	}
	public void setLastActionId(Integer lastActionId) {
		this.lastActionId = lastActionId;
	}
	
	public byte[] getKdr() {
		return kdr;
	}
	public void setKdr(byte[] kdr) {
		this.kdr = kdr;
	}
	public byte[] getKey() {
		return key;
	}
	public void setKey(byte[] key) {
		this.key = key;
	}
	public Long getAppletFk() {
		return appletFk;
	}
	public void setAppletFk(Long appletFk) {
		this.appletFk = appletFk;
	}
	public Long getSimProfileFk() {
		return simProfileFk;
	}
	public void setSimProfileFk(Long simProfileFk) {
		this.simProfileFk = simProfileFk;
	}
	public void setRequest(SleepyPushRequest request) {
		this.request = request;
	}
	public void setResponse(SleepyPushResponse response) {
		this.response = response;
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
	public SleepyPushRequest getRequest() {
		return request;
	}
	public SleepyPushResponse getResponse() {
		return response;
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
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	public Boolean getCheckCampaignExclusions() {
		return checkCampaignExclusions;
	}
	public void setCheckCampaignExclusions(Boolean checkCampaignExclusions) {
		this.checkCampaignExclusions = checkCampaignExclusions;
	}
	public Boolean getCheckBrowserExclusions() {
		return checkBrowserExclusions;
	}
	public void setCheckBrowserExclusions(Boolean checkBrowserExclusions) {
		this.checkBrowserExclusions = checkBrowserExclusions;
	}
	public Long getPricepointId() {
		return pricepoint;
	}
	public void setPricepointId(Long pricepoint) {
		this.pricepoint = pricepoint;
	}
	
	
}
