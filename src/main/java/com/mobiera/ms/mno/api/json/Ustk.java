package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.ustk.UstkRequest;
import com.mobiera.aircast.api.v1.ustk.UstkResponse;
import com.mobiera.aircast.commons.enums.AppletImpl;

@JsonInclude(Include.NON_NULL)
public class Ustk implements Serializable, Event {

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
	private String errorMsg;
	
	
	
	
	private String id;
	private String serviceTpda;
	//private Boolean dlrRequested;
	private UstkRequest request;
	private AppletImpl appletImpl;
	private UstkResponse response;
	//private Integer lastActionId;
	
	
	private Boolean checkCampaignExclusions;
	private Boolean checkBrowserExclusions;
	
	
	public String getServiceTpda() {
		return serviceTpda;
	}
	public void setServiceTpda(String serviceTpda) {
		this.serviceTpda = serviceTpda;
	}
	
	public UstkRequest getRequest() {
		return request;
	}
	public void setRequest(UstkRequest request) {
		this.request = request;
	}
	public AppletImpl getAppletImpl() {
		return appletImpl;
	}
	public void setAppletImpl(AppletImpl appletImpl) {
		this.appletImpl = appletImpl;
	}
	
	
	public UstkResponse getResponse() {
		return response;
	}
	public void setResponse(UstkResponse response) {
		this.response = response;
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
