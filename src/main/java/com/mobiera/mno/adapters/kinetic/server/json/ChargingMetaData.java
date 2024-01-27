package com.mobiera.mno.adapters.kinetic.server.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChargingMetaData {
	private String channel;
	private String chargingEvent; // ON_DEMAND, SUBSCRIPTION_FULL, SUBSCRIPTION_PARTIAL, SUBSCRIPTION_COMPLEMENT
	private String taxAmount;
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChargingEvent() {
		return chargingEvent;
	}
	public void setChargingEvent(String chargingEvent) {
		this.chargingEvent = chargingEvent;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	
}
