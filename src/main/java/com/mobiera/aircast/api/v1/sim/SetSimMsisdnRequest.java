package com.mobiera.aircast.api.v1.sim;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.SlaveConstants;
import com.mobiera.aircast.commons.enums.SubscriberPlan;
import com.mobiera.aircast.commons.enums.SubscriberType;

@JsonInclude(Include.NON_NULL)
public class SetSimMsisdnRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private String msisdn;
	private String iccid;
	private String imsi;
	private Boolean allowMsisdnSwapping;
	private Instant msisdnValidUntil;
	private SubscriberType subscriberType;
	private SubscriberPlan subscriberPlan;
	private Boolean mnoAdAllowed;
	private Boolean tpAdAllowed;
	private Instant subscriberSinceTs;
	private Boolean alwaysNotify;
	
	
	public Instant getMsisdnValidUntil() {
		return msisdnValidUntil;
	}
	public void setMsisdnValidUntil(Instant msisdnValidUntil) {
		this.msisdnValidUntil = msisdnValidUntil;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public Boolean getAllowMsisdnSwapping() {
		return allowMsisdnSwapping;
	}
	public void setAllowMsisdnSwapping(Boolean allowMsisdnSwapping) {
		this.allowMsisdnSwapping = allowMsisdnSwapping;
	}
	 

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer(256);
		buffer.append("SetSimRequest: iccid: ").append(iccid).append(" imsi: ")
		.append(imsi).append(" msisdn: ").append(msisdn).append(" allowMsisdnSwapping: " + allowMsisdnSwapping)
		.append(" msisdnValidUntil: " + msisdnValidUntil!=null?SlaveConstants.DEFAULT_DATE_FORMAT.format(msisdnValidUntil):null);
		return buffer.toString();
	}
	public SubscriberType getSubscriberType() {
		return subscriberType;
	}
	public void setSubscriberType(SubscriberType subscriberType) {
		this.subscriberType = subscriberType;
	}
	public SubscriberPlan getSubscriberPlan() {
		return subscriberPlan;
	}
	public void setSubscriberPlan(SubscriberPlan subscriberPlan) {
		this.subscriberPlan = subscriberPlan;
	}
	public Boolean getMnoAdAllowed() {
		return mnoAdAllowed;
	}
	public void setMnoAdAllowed(Boolean mnoAdAllowed) {
		this.mnoAdAllowed = mnoAdAllowed;
	}
	public Boolean getTpAdAllowed() {
		return tpAdAllowed;
	}
	public void setTpAdAllowed(Boolean tpAdAllowed) {
		this.tpAdAllowed = tpAdAllowed;
	}
	public Instant getSubscriberSinceTs() {
		return subscriberSinceTs;
	}
	public void setSubscriberSinceTs(Instant subscriberSinceTs) {
		this.subscriberSinceTs = subscriberSinceTs;
	}
	public Boolean getAlwaysNotify() {
		return alwaysNotify;
	}
	public void setAlwaysNotify(Boolean alwaysNotify) {
		this.alwaysNotify = alwaysNotify;
	}
	
	
}
