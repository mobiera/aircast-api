package com.mobiera.ms.mno.api.json;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.IdentifierType;
import com.mobiera.ms.mno.api.enums.ChargingEventType;

@JsonInclude(Include.NON_NULL)
public class ChargingEvent implements Serializable, Event {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8667410348092942563L;
	
	
	private Long subscriptionId;
	private String offerId;
	private String userTpda;
	private String userAcr;
	private String customParam;
	private String tpNotifParam;
	private String smppAccount; // smppAccount
	private String endpoint; // endpoint
	private String campaign; // campaign
	private Long pricepoint;
	private String pricepointCode;
	private String requestId; // tp requestId
	private Boolean test;
	private Instant ts;
	
	private IdentifierType identifierType;
	private Long identifierId;
	private String identifierName;
	
	
	private UUID chargeId;
	private ChargingEventType chargingEventType;
	private Double amount;
	
	
	public UUID getChargeId() {
		return chargeId;
	}
	public void setChargeId(UUID chargeId) {
		this.chargeId = chargeId;
	}
	public ChargingEventType getChargingEventType() {
		return chargingEventType;
	}
	public void setChargingEventType(ChargingEventType chargingEventType) {
		this.chargingEventType = chargingEventType;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
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
	public Long getPricepointId() {
		return pricepoint;
	}
	public void setPricepointId(Long pricepoint) {
		this.pricepoint = pricepoint;
	}
	public IdentifierType getIdentifierType() {
		return identifierType;
	}
	public void setIdentifierType(IdentifierType identifierType) {
		this.identifierType = identifierType;
	}
	public Long getIdentifierId() {
		return identifierId;
	}
	public void setIdentifierId(Long identifierId) {
		this.identifierId = identifierId;
	}
	public String getIdentifierName() {
		return identifierName;
	}
	public void setIdentifierName(String identifierName) {
		this.identifierName = identifierName;
	}
	public Long getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public Long getPricepoint() {
		return pricepoint;
	}
	public void setPricepoint(Long pricepoint) {
		this.pricepoint = pricepoint;
	}
	public String getPricepointCode() {
		return pricepointCode;
	}
	public void setPricepointCode(String pricepointCode) {
		this.pricepointCode = pricepointCode;
	}
	
	
	
	
}
