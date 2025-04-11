package com.mobiera.ms.mno.aircast.api.ms;


import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AppletImpl;
import com.mobiera.aircast.commons.enums.CipheringAlgorithm;
import com.mobiera.aircast.commons.enums.SleepyKeyingMode;
import com.mobiera.aircast.commons.enums.SleepyMenuImpl;
import com.mobiera.aircast.commons.enums.SleepyProtocolVersion;
import com.mobiera.aircast.commons.enums.SubscriberPlan;
import com.mobiera.aircast.commons.enums.SubscriberType;
import com.mobiera.lib.etsi102225.api.model.CardProfile;

@JsonInclude(Include.NON_NULL)
public class SimMS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4829352845298862370L;

	private String errorMsg;
	
	private Long id;
	private Long counter;
	private String iccid;
	private String imsi;
	private String msisdn;
	
	
	/*
	 * user data
	 */
	private Instant msisdnValidUntilTs;
	private Instant lastSeenAliveTs;
	private Integer browserVersion;
	private Integer sleepySessionIdIndex;
	private Long simProfile;
	private SubscriberType subscriberType;
	private SubscriberPlan subscriberPlan;
	private Instant subscriberSinceTs;
	private Boolean mnoAdAllowed;
	private Boolean tpAdAllowed;
	private Boolean state1;
	private Boolean state2;
	
	
	/*
	 * OTA data
	 */
	private CardProfile cardProfile;
	private byte[] ekic;
	private byte[] ekid;
	private byte[] ekik;
	
	
	/*
	 * Applet config
	 */
	

	private AppletImpl appletImpl;
	private Integer version;
	private Boolean picoSupportsUCS2;
	private Boolean picoBuggyUCS2forSendSms;
	private SleepyProtocolVersion sleepyProtocolVersion;
	private SleepyKeyingMode sleepyKeyingMode;
	private CipheringAlgorithm sleepyCipheringAlgorithm;
	private SleepyMenuImpl sleepyMenuImpl;
	private Boolean sleepyWhiteList;
	private Boolean sleepyCompare;
	private Boolean sleepyImeiTracking;
	private Boolean commandEncryption;
	private Boolean responseEncryption;
	private Boolean simOsIccidIncludesLuhnNumber;
	private byte[] sleepyKey;
	private byte[] ekdr;
	private byte[] sleepyRandom;
	private Boolean sleepyCipherDiscovery;
	private Boolean gsm348;
	
	private AppletImpl lastTestedStkImpl;
	
	private Boolean notifyAlive;
	
	private Instant lastP0SentTs;
	private Instant nextP0ScheduleTs;
	private Instant lastP0SuccessTs;
	private Instant lastP1SentTs;
	private Instant nextP1ScheduleTs;
	private Instant lastP1SuccessTs;
	private Instant lastP2SentTs;
	private Instant nextP2ScheduleTs;
	private Instant lastP2SuccessTs;
	
	
	
	private Instant lastP3SentTs;
	private Instant nextP3ScheduleTs;
	private Instant lastP3SuccessTs;
	private Instant lastP4SentTs;
	private Instant nextP4ScheduleTs;
	private Instant lastP4SuccessTs;
	private Instant lastP5SentTs;
	private Instant nextP5ScheduleTs;
	private Instant lastP5SuccessTs;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCounter() {
		return counter;
	}
	public void setCounter(Long counter) {
		this.counter = counter;
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
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Instant getMsisdnValidUntilTs() {
		return msisdnValidUntilTs;
	}
	public void setMsisdnValidUntilTs(Instant msisdnValidUntilTs) {
		this.msisdnValidUntilTs = msisdnValidUntilTs;
	}
	public Instant getLastSeenAliveTs() {
		return lastSeenAliveTs;
	}
	public void setLastSeenAliveTs(Instant lastSeenAliveTs) {
		this.lastSeenAliveTs = lastSeenAliveTs;
	}
	public Integer getBrowserVersion() {
		return browserVersion;
	}
	public void setBrowserVersion(Integer browserVersion) {
		this.browserVersion = browserVersion;
	}
	public Integer getSleepySessionIdIndex() {
		return sleepySessionIdIndex;
	}
	public void setSleepySessionIdIndex(Integer sleepySessionIdIndex) {
		this.sleepySessionIdIndex = sleepySessionIdIndex;
	}
	public Long getSimProfile() {
		return simProfile;
	}
	public void setSimProfile(Long simProfile) {
		this.simProfile = simProfile;
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
	public Instant getSubscriberSinceTs() {
		return subscriberSinceTs;
	}
	public void setSubscriberSinceTs(Instant subscriberSinceTs) {
		this.subscriberSinceTs = subscriberSinceTs;
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
	public Boolean getState1() {
		return state1;
	}
	public void setState1(Boolean state1) {
		this.state1 = state1;
	}
	public Boolean getState2() {
		return state2;
	}
	public void setState2(Boolean state2) {
		this.state2 = state2;
	}
	public CardProfile getCardProfile() {
		return cardProfile;
	}
	public void setCardProfile(CardProfile cardProfile) {
		this.cardProfile = cardProfile;
	}
	public byte[] getEkic() {
		return ekic;
	}
	public void setEkic(byte[] ekic) {
		this.ekic = ekic;
	}
	public byte[] getEkid() {
		return ekid;
	}
	public void setEkid(byte[] ekid) {
		this.ekid = ekid;
	}
	
	public AppletImpl getAppletImpl() {
		return appletImpl;
	}
	public void setAppletImpl(AppletImpl appletImpl) {
		this.appletImpl = appletImpl;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Boolean getPicoSupportsUCS2() {
		return picoSupportsUCS2;
	}
	public void setPicoSupportsUCS2(Boolean picoSupportsUCS2) {
		this.picoSupportsUCS2 = picoSupportsUCS2;
	}
	public Boolean getPicoBuggyUCS2forSendSms() {
		return picoBuggyUCS2forSendSms;
	}
	public void setPicoBuggyUCS2forSendSms(Boolean picoBuggyUCS2forSendSms) {
		this.picoBuggyUCS2forSendSms = picoBuggyUCS2forSendSms;
	}
	public SleepyProtocolVersion getSleepyProtocolVersion() {
		return sleepyProtocolVersion;
	}
	public void setSleepyProtocolVersion(SleepyProtocolVersion sleepyProtocolVersion) {
		this.sleepyProtocolVersion = sleepyProtocolVersion;
	}
	public SleepyKeyingMode getSleepyKeyingMode() {
		return sleepyKeyingMode;
	}
	public void setSleepyKeyingMode(SleepyKeyingMode sleepyKeyingMode) {
		this.sleepyKeyingMode = sleepyKeyingMode;
	}
	public CipheringAlgorithm getSleepyCipheringAlgorithm() {
		return sleepyCipheringAlgorithm;
	}
	public void setSleepyCipheringAlgorithm(CipheringAlgorithm sleepyCipheringAlgorithm) {
		this.sleepyCipheringAlgorithm = sleepyCipheringAlgorithm;
	}
	public SleepyMenuImpl getSleepyMenuImpl() {
		return sleepyMenuImpl;
	}
	public void setSleepyMenuImpl(SleepyMenuImpl sleepyMenuImpl) {
		this.sleepyMenuImpl = sleepyMenuImpl;
	}
	public Boolean getSleepyWhiteList() {
		return sleepyWhiteList;
	}
	public void setSleepyWhiteList(Boolean sleepyWhiteList) {
		this.sleepyWhiteList = sleepyWhiteList;
	}
	public Boolean getSleepyCompare() {
		return sleepyCompare;
	}
	public void setSleepyCompare(Boolean sleepyCompare) {
		this.sleepyCompare = sleepyCompare;
	}
	public Boolean getSleepyImeiTracking() {
		return sleepyImeiTracking;
	}
	public void setSleepyImeiTracking(Boolean sleepyImeiTracking) {
		this.sleepyImeiTracking = sleepyImeiTracking;
	}
	public byte[] getSleepyKey() {
		return sleepyKey;
	}
	public void setSleepyKey(byte[] sleepyKey) {
		this.sleepyKey = sleepyKey;
	}
	public Boolean getCommandEncryption() {
		return commandEncryption;
	}
	public void setCommandEncryption(Boolean commandEncryption) {
		this.commandEncryption = commandEncryption;
	}
	public Boolean getResponseEncryption() {
		return responseEncryption;
	}
	public void setResponseEncryption(Boolean responseEncryption) {
		this.responseEncryption = responseEncryption;
	}
	public Boolean getSimOsIccidIncludesLuhnNumber() {
		return simOsIccidIncludesLuhnNumber;
	}
	public void setSimOsIccidIncludesLuhnNumber(Boolean simOsIccidIncludesLuhnNumber) {
		this.simOsIccidIncludesLuhnNumber = simOsIccidIncludesLuhnNumber;
	}
	public byte[] getEkdr() {
		return ekdr;
	}
	public void setEkdr(byte[] ekdr) {
		this.ekdr = ekdr;
	}
	public byte[] getSleepyRandom() {
		return sleepyRandom;
	}
	public void setSleepyRandom(byte[] sleepyRandom) {
		this.sleepyRandom = sleepyRandom;
	}
	public byte[] getEkik() {
		return ekik;
	}
	public void setEkik(byte[] ekik) {
		this.ekik = ekik;
	}
	public AppletImpl getLastTestedStkImpl() {
		return lastTestedStkImpl;
	}
	public void setLastTestedStkImpl(AppletImpl lastTestedStkImpl) {
		this.lastTestedStkImpl = lastTestedStkImpl;
	}
	public Boolean getGsm348() {
		return gsm348;
	}
	public void setGsm348(Boolean gsm348) {
		this.gsm348 = gsm348;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Boolean getNotifyAlive() {
		return notifyAlive;
	}
	public void setNotifyAlive(Boolean notifyAlive) {
		this.notifyAlive = notifyAlive;
	}
	public Instant getLastP0SentTs() {
		return lastP0SentTs;
	}
	public void setLastP0SentTs(Instant lastP0SentTs) {
		this.lastP0SentTs = lastP0SentTs;
	}
	public Instant getNextP0ScheduleTs() {
		return nextP0ScheduleTs;
	}
	public void setNextP0ScheduleTs(Instant nextP0ScheduleTs) {
		this.nextP0ScheduleTs = nextP0ScheduleTs;
	}
	public Instant getLastP0SuccessTs() {
		return lastP0SuccessTs;
	}
	public void setLastP0SuccessTs(Instant lastP0SuccessTs) {
		this.lastP0SuccessTs = lastP0SuccessTs;
	}
	public Instant getLastP1SentTs() {
		return lastP1SentTs;
	}
	public void setLastP1SentTs(Instant lastP1SentTs) {
		this.lastP1SentTs = lastP1SentTs;
	}
	public Instant getNextP1ScheduleTs() {
		return nextP1ScheduleTs;
	}
	public void setNextP1ScheduleTs(Instant nextP1ScheduleTs) {
		this.nextP1ScheduleTs = nextP1ScheduleTs;
	}
	public Instant getLastP1SuccessTs() {
		return lastP1SuccessTs;
	}
	public void setLastP1SuccessTs(Instant lastP1SuccessTs) {
		this.lastP1SuccessTs = lastP1SuccessTs;
	}
	public Instant getLastP2SentTs() {
		return lastP2SentTs;
	}
	public void setLastP2SentTs(Instant lastP2SentTs) {
		this.lastP2SentTs = lastP2SentTs;
	}
	public Instant getNextP2ScheduleTs() {
		return nextP2ScheduleTs;
	}
	public void setNextP2ScheduleTs(Instant nextP2ScheduleTs) {
		this.nextP2ScheduleTs = nextP2ScheduleTs;
	}
	public Instant getLastP2SuccessTs() {
		return lastP2SuccessTs;
	}
	public void setLastP2SuccessTs(Instant lastP2SuccessTs) {
		this.lastP2SuccessTs = lastP2SuccessTs;
	}
	public Boolean getSleepyCipherDiscovery() {
		return sleepyCipherDiscovery;
	}
	public void setSleepyCipherDiscovery(Boolean sleepyCipherDiscovery) {
		this.sleepyCipherDiscovery = sleepyCipherDiscovery;
	}
	public Instant getLastP3SentTs() {
		return lastP3SentTs;
	}
	public void setLastP3SentTs(Instant lastP3SentTs) {
		this.lastP3SentTs = lastP3SentTs;
	}
	public Instant getNextP3ScheduleTs() {
		return nextP3ScheduleTs;
	}
	public void setNextP3ScheduleTs(Instant nextP3ScheduleTs) {
		this.nextP3ScheduleTs = nextP3ScheduleTs;
	}
	public Instant getLastP3SuccessTs() {
		return lastP3SuccessTs;
	}
	public void setLastP3SuccessTs(Instant lastP3SuccessTs) {
		this.lastP3SuccessTs = lastP3SuccessTs;
	}
	public Instant getLastP4SentTs() {
		return lastP4SentTs;
	}
	public void setLastP4SentTs(Instant lastP4SentTs) {
		this.lastP4SentTs = lastP4SentTs;
	}
	public Instant getNextP4ScheduleTs() {
		return nextP4ScheduleTs;
	}
	public void setNextP4ScheduleTs(Instant nextP4ScheduleTs) {
		this.nextP4ScheduleTs = nextP4ScheduleTs;
	}
	public Instant getLastP4SuccessTs() {
		return lastP4SuccessTs;
	}
	public void setLastP4SuccessTs(Instant lastP4SuccessTs) {
		this.lastP4SuccessTs = lastP4SuccessTs;
	}
	public Instant getLastP5SentTs() {
		return lastP5SentTs;
	}
	public void setLastP5SentTs(Instant lastP5SentTs) {
		this.lastP5SentTs = lastP5SentTs;
	}
	public Instant getNextP5ScheduleTs() {
		return nextP5ScheduleTs;
	}
	public void setNextP5ScheduleTs(Instant nextP5ScheduleTs) {
		this.nextP5ScheduleTs = nextP5ScheduleTs;
	}
	public Instant getLastP5SuccessTs() {
		return lastP5SuccessTs;
	}
	public void setLastP5SuccessTs(Instant lastP5SuccessTs) {
		this.lastP5SuccessTs = lastP5SuccessTs;
	}
	
	
	
	
	
}
