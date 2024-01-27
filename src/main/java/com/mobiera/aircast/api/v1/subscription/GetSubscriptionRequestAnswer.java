package com.mobiera.aircast.api.v1.subscription;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.mno.api.json.SubscriptionEvent;

@JsonInclude(Include.NON_NULL)
public class GetSubscriptionRequestAnswer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8747838349299308322L;
	private GetSubscriptionRequestResult result;
	private String errorMessage;
	private SubscriptionEvent subscription;
	public GetSubscriptionRequestResult getResult() {
		return result;
	}
	public void setResult(GetSubscriptionRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public SubscriptionEvent getSubscription() {
		return subscription;
	}
	public void setSubscription(SubscriptionEvent subscription) {
		this.subscription = subscription;
	}
	
	
	
	

}
