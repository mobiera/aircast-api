package com.mobiera.aircast.api.v1.sim;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.SimIdentifier;
import com.mobiera.aircast.commons.enums.SubscriberPlan;
import com.mobiera.aircast.commons.enums.SubscriberType;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class CreateOrUpdateSimRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private String msisdn;
	private String iccid;
	private String imsi;
	private String roamingImsi;
	private String imei;
	private String kic;
	private String kid;
	private String kik;
	private SubscriberType subscriberType;
	private SubscriberPlan subscriberPlan;
	private Boolean setNullIccid;
	private Boolean setNullImsi;
	private Boolean setNullMsisdn;
	private Boolean setNullImei;
	private Boolean mnoAdAllowed;
	private Boolean tpAdAllowed;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant subscriberSinceTs;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastSeenAliveTs;
	
	private Boolean alwaysNotify;
	
	public final Boolean getSetNullImei() {
		return setNullImei;
	}
	public final void setSetNullImei(Boolean setNullImei) {
		this.setNullImei = setNullImei;
	}
	private SimIdentifier identifier;
	private Instant msisdnValidUntil;
	private Long simProfileId;
	
	public Long getSimProfileId() {
		return simProfileId;
	}
	public void setSimProfileId(Long simProfileId) {
		this.simProfileId = simProfileId;
	}
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
	
	public final Boolean getSetNullIccid() {
		return setNullIccid;
	}
	public final void setSetNullIccid(Boolean setNullIccid) {
		this.setNullIccid = setNullIccid;
	}
	public final Boolean getSetNullImsi() {
		return setNullImsi;
	}
	public final void setSetNullImsi(Boolean setNullImsi) {
		this.setNullImsi = setNullImsi;
	}
	public final Boolean getSetNullMsisdn() {
		return setNullMsisdn;
	}
	public final void setSetNullMsisdn(Boolean setNullMsisdn) {
		this.setNullMsisdn = setNullMsisdn;
	}
	public final SimIdentifier getIdentifier() {
		return identifier;
	}
	public final void setIdentifier(SimIdentifier identifier) {
		this.identifier = identifier;
	}
	public final String getImei() {
		return imei;
	}
	public final void setImei(String imei) {
		this.imei = imei;
	}
	public final String getKic() {
		return kic;
	}
	public final void setKic(String kic) {
		this.kic = kic;
	}
	public final String getKid() {
		return kid;
	}
	public final void setKid(String kid) {
		this.kid = kid;
	}
	public final String getKik() {
		return kik;
	}
	public final void setKik(String kik) {
		this.kik = kik;
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
	public String getRoamingImsi() {
		return roamingImsi;
	}
	public void setRoamingImsi(String roamingImsi) {
		this.roamingImsi = roamingImsi;
	}
	public Instant getLastSeenAliveTs() {
		return lastSeenAliveTs;
	}
	public void setLastSeenAliveTs(Instant lastSeenAliveTs) {
		this.lastSeenAliveTs = lastSeenAliveTs;
	}
	

	
	
}
