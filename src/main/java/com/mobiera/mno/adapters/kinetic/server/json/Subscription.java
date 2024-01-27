package com.mobiera.mno.adapters.kinetic.server.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Subscription {
	
	private String endUserId;
	private String identifierId;
	private String identifierLabel;
	private String identifierClass;
	private String serviceId;
	private String serviceIdentifierId;
	private String subscriptionId;
	private String subscriptionOperationStatus; // SUBSCRIBED UNSUBSCRIBED

	private String subscriptionPeriodicity;  // DAY, EACH_2_DAYS, WEEK, MONTH
	private String subscriptionStartDateTime;
	private String subscriptionValidUntilDateTime;
	
	// deprecated
	
	private String landingId;
	private String referenceCode;
	private String resourceURL;
	private String campaignId;
	private String trackingParam;
	
	
	public String getEndUserId() {
		return endUserId;
	}
	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
	}
	public String getIdentifierId() {
		return identifierId;
	}
	public void setIdentifierId(String identifierId) {
		this.identifierId = identifierId;
	}
	public String getIdentifierLabel() {
		return identifierLabel;
	}
	public void setIdentifierLabel(String identifierLabel) {
		this.identifierLabel = identifierLabel;
	}
	public String getIdentifierClass() {
		return identifierClass;
	}
	public void setIdentifierClass(String identifierClass) {
		this.identifierClass = identifierClass;
	}
	
	public String getSubscriptionOperationStatus() {
		return subscriptionOperationStatus;
	}
	public void setSubscriptionOperationStatus(String subscriptionOperationStatus) {
		this.subscriptionOperationStatus = subscriptionOperationStatus;
	}
	public String getSubscriptionPeriodicity() {
		return subscriptionPeriodicity;
	}
	public void setSubscriptionPeriodicity(String subscriptionPeriodicity) {
		this.subscriptionPeriodicity = subscriptionPeriodicity;
	}
	
	public String getReferenceCode() {
		return referenceCode;
	}
	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}
	public String getResourceURL() {
		return resourceURL;
	}
	public void setResourceURL(String resourceURL) {
		this.resourceURL = resourceURL;
	}
	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getTrackingParam() {
		return trackingParam;
	}
	public void setTrackingParam(String trackingParam) {
		this.trackingParam = trackingParam;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceIdentifierId() {
		return serviceIdentifierId;
	}
	public void setServiceIdentifierId(String serviceIdentifierId) {
		this.serviceIdentifierId = serviceIdentifierId;
	}
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getLandingId() {
		return landingId;
	}
	public void setLandingId(String landingId) {
		this.landingId = landingId;
	}
	public String getSubscriptionStartDateTime() {
		return subscriptionStartDateTime;
	}
	public void setSubscriptionStartDateTime(String subscriptionStartDateTime) {
		this.subscriptionStartDateTime = subscriptionStartDateTime;
	}
	public String getSubscriptionValidUntilDateTime() {
		return subscriptionValidUntilDateTime;
	}
	public void setSubscriptionValidUntilDateTime(String subscriptionValidUntilDateTime) {
		this.subscriptionValidUntilDateTime = subscriptionValidUntilDateTime;
	}
	
	
	
}
