package com.mobiera.mno.adapters.kinetic.server.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PaymentAmount {
	private ChargingInformation chargingInformation;
	private ChargingMetaData chargingMetaData;
	private String totalAmountCharged;
	
	
	public ChargingInformation getChargingInformation() {
		return chargingInformation;
	}
	public void setChargingInformation(ChargingInformation chargingInformation) {
		this.chargingInformation = chargingInformation;
	}
	public ChargingMetaData getChargingMetaData() {
		return chargingMetaData;
	}
	public void setChargingMetaData(ChargingMetaData chargingMetaData) {
		this.chargingMetaData = chargingMetaData;
	}
	public String getTotalAmountCharged() {
		return totalAmountCharged;
	}
	public void setTotalAmountCharged(String totalAmountCharged) {
		this.totalAmountCharged = totalAmountCharged;
	}
	
	
}
