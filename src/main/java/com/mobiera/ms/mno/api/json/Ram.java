package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.v1.ram.RamRequest;
import com.mobiera.aircast.api.v1.ram.RamResponse;

/**
 * Internal carrier of one RAM (applet management over the air) packet exchange between
 * rest-endpoint and ustk, mirrors {@link Ustk}.
 */
@JsonInclude(Include.NON_NULL)
public class Ram implements Serializable, Event {

	private static final long serialVersionUID = 4278104573322987314L;

	private String offerId;
	private String userTpda;
	private String userAcr;
	private String customParam;
	private String tpNotifParam;
	private String smppAccount;
	private String endpoint;
	private String campaign;
	private Long pricepointId;
	private String requestId;
	private Boolean test;
	private Instant ts;
	private String errorMsg;
	private String id;
	private String serviceTpda;
	private RamRequest request;
	private RamResponse response;
	private Integer totalPackets;

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

	public Long getPricepointId() {
		return pricepointId;
	}
	public void setPricepointId(Long pricepointId) {
		this.pricepointId = pricepointId;
	}

	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getServiceTpda() {
		return serviceTpda;
	}
	public void setServiceTpda(String serviceTpda) {
		this.serviceTpda = serviceTpda;
	}

	public RamRequest getRequest() {
		return request;
	}
	public void setRequest(RamRequest request) {
		this.request = request;
	}

	public RamResponse getResponse() {
		return response;
	}
	public void setResponse(RamResponse response) {
		this.response = response;
	}

	public Integer getTotalPackets() {
		return totalPackets;
	}
	public void setTotalPackets(Integer totalPackets) {
		this.totalPackets = totalPackets;
	}

}
