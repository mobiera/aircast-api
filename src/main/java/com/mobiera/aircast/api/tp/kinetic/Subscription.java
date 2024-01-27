package com.mobiera.aircast.api.tp.kinetic;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Subscription implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8472331497248500198L;
	private String endUserId;
	private String identifierId;
	private String referenceCode;
	private String subscriptionOperationStatus;
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
	public String getReferenceCode() {
		return referenceCode;
	}
	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}
	public String getSubscriptionOperationStatus() {
		return subscriptionOperationStatus;
	}
	public void setSubscriptionOperationStatus(String subscriptionOperationStatus) {
		this.subscriptionOperationStatus = subscriptionOperationStatus;
	}
	
}
