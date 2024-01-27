package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)

public class Discovery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7960755744857629469L;
	
	
	private String userTpda;
	private Long smppAccount; // smppAccount
	private Long campaign; // campaign
	private Long requestId; // tp requestId
	private Boolean test;
	private Instant ts;
	
	
	
	private UUID id;
	private String serviceTpda;
	private Boolean dlrRequested;
	public String getUserTpda() {
		return userTpda;
	}
	public void setUserTpda(String userTpda) {
		this.userTpda = userTpda;
	}
	public Long getSmppAccount() {
		return smppAccount;
	}
	public void setSmppAccount(Long smppAccount) {
		this.smppAccount = smppAccount;
	}
	public Long getCampaign() {
		return campaign;
	}
	public void setCampaign(Long campaign) {
		this.campaign = campaign;
	}
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
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
	
	
	
}
