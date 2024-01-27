package com.mobiera.aircast.api.v1.subscription;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.mno.api.json.SubscriptionEvent;

@JsonInclude(Include.NON_NULL)
public class FindSubscriptionsRequestAnswer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8747838349299308322L;
	private FindSubscriptionsRequestResult result;
	private String errorMessage;
	private List<SubscriptionEvent> subscriptions;
	public FindSubscriptionsRequestResult getResult() {
		return result;
	}
	public void setResult(FindSubscriptionsRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<SubscriptionEvent> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<SubscriptionEvent> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	
	
	

}
