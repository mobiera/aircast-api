package com.mobiera.aircast.api.vo;


import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.AppletImpl;
import com.mobiera.aircast.commons.enums.SubscriberPlan;
import com.mobiera.aircast.commons.enums.SubscriberType;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class SimVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4829352845298862370L;

	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY, 
	label="id", 
	description="id of Sim")
	@Section(name = "BASIC_INFORMATION")
	private Long id;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="counter", 
			description="counter")
			@Section(name = "OTA")
	private Long counter;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="iccid", 
			description="iccid")
			@Section(name = "BASIC_INFORMATION")
	private String iccid;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="imsi", 
			description="imsi")
			@Section(name = "BASIC_INFORMATION")
	private String imsi;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="msisdn", 
			description="msisdn")
			@Section(name = "SUBSCRIBER")
			
	private String msisdn;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="imei", 
			description="imei")
			@Section(name = "DEVICE")
			
	private String imei;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="mcc", 
			description="mcc")
			@Section(name = "LOCATION")
			
	private Integer mcc;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="mnc", 
			description="mnc")
			@Section(name = "LOCATION")
			
	private Integer mnc;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="lactac", 
			description="lactac")
			@Section(name = "LOCATION")
			
	private Long lactac;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="cellId", 
			description="cellId")
			@Section(name = "LOCATION")
			
	private Long cellId;
	
	
	
	@TargetClass(type=ClassType.ENUM, name="AppletImpl")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="stk Impl", 
			description="STK Implementation")
			@Section(name = "STK")
			
	private AppletImpl stkImpl;
	
	@TargetClass(type=ClassType.VO, name="AppletVO")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Applet", 
			description="Applet")
			@Section(name = "STK")
	private Long stkApplet;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Msisdn Valid Until Ts", 
			description="Msisdn Valid Until Ts")
			@Section(name = "SUBSCRIBER")
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant msisdnValidUntilTs;
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last Seen Alive Ts", 
			description="Last Seen Alive Ts")
			@Section(name = "SUBSCRIBER")
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastSeenAliveTs;
	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY, 
			label="latitude", 
			description="latitude")
			@Section(name = "LOCATION")
	private Double latitude;
	
	
	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY, 
			label="longitude", 
			description="longitude")
			@Section(name = "LOCATION")
			
	private Double longitude;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Browser Version", 
			description="Browser Version")
			@Section(name = "STK")
			
	private Integer browserVersion;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Sleepy SessionId Index", 
			description="Sleepy SessionId Index")
			@Section(name = "STK")
			
	private Integer sleepySessionIdIndex;
	
	@TargetClass(type=ClassType.VO, name="SimProfileVO")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Sim Profile", 
			description="Sim Profile")
			@Section(name = "BASIC_INFORMATION")
			
	private Long simProfile;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Subscriber Type", 
			description="Subscriber Type")
			@Section(name = "SUBSCRIBER")
	@TargetClass(type=ClassType.ENUM, name="SubscriberType")
			
	private SubscriberType subscriberType;
	
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Subscriber Plan", 
			description="Subscriber Plan")
			@Section(name = "SUBSCRIBER")
	@TargetClass(type=ClassType.ENUM, name="SubscriberPlan")
			
	private SubscriberPlan subscriberPlan;
	
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Subscriber Since Ts", 
			description="Subscriber Since Ts")
			@Section(name = "SUBSCRIBER")
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant subscriberSinceTs;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Mno Ad Allowed", 
			description="If msisdn can receive Mobile Network Operator advertising")
			@Section(name = "SUBSCRIBER")
			
	private Boolean mnoAdAllowed;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Tp Ad Allowed", 
			description="If msisdn can receive Third Party advertising")
			@Section(name = "SUBSCRIBER")
			
	private Boolean tpAdAllowed;
	
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="State1", 
			description="State1 for this msisdn")
			@Section(name = "SUBSCRIBER")
			
	private Boolean state1;
	
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="State2", 
			description="State2 for this msisdn")
			@Section(name = "SUBSCRIBER")
			
	private Boolean state2;
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P0 Sent Ts", 
			description="Last P0 Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP0SentTs;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Next P0 Schedule Ts", 
			description="Next P0 Schedule Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant nextP0ScheduleTs;
	
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P0 Success Ts", 
			description="Last P0 Success Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP0SuccessTs;
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P1 Sent Ts", 
			description="Last P1 Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP1SentTs;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Next P1 Schedule Ts", 
			description="Next P1 Schedule Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant nextP1ScheduleTs;
	
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P1 Success Ts", 
			description="Last P1 Success Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP1SuccessTs;
	
	
	

	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P2 Sent Ts", 
			description="Last P2 Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP2SentTs;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Next P2 Schedule Ts", 
			description="Next P2 Schedule Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant nextP2ScheduleTs;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P3 Sent Ts", 
			description="Last P3 Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP3SentTs;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Next P3 Schedule Ts", 
			description="Next P3 Schedule Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant nextP3ScheduleTs;
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P4 Sent Ts", 
			description="Last P4 Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP4SentTs;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Next P4 Schedule Ts", 
			description="Next P4 Schedule Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant nextP4ScheduleTs;
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P5 Sent Ts", 
			description="Last P5 Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP5SentTs;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Next P5 Schedule Ts", 
			description="Next P5 Schedule Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant nextP5ScheduleTs;
	
	
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P2 Success Ts", 
			description="Last P2 Success Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP2SuccessTs;
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P3 Success Ts", 
			description="Last P3 Success Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP3SuccessTs;
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P4 Success Ts", 
			description="Last P4 Success Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP4SuccessTs;
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last P5 Success Ts", 
			description="Last P5 Success Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastP5SuccessTs;
	
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last Discovery Sent Ts", 
			description="Last Discovery Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastDiscoverySentTs;
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Next Discovery Schedule Ts", 
			description="Next Discovery Schedule Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant nextDiscoveryScheduleTs;
	
	
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last Discovery Success Ts", 
			description="Last Discovery Success Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastDiscoverySuccessTs;
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last Permanent Sent Ts", 
			description="Last Permanent Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastPermanentSentTs;
	
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_WRITE, 
			label="Next Permanent Schedule Ts", 
			description="Next Permanent Schedule Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant nextPermanentScheduleTs;
	
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last Permanent Success Ts", 
			description="Last Permanent Success Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastPermanentSuccessTs;
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last Api Sent Ts", 
			description="Last Api Sent Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastApiSentTs;
	
	
	
	@UI( widgetType = WidgetType.DATETIME, 
			mode = Mode.READ_ONLY, 
			label="Last Api Spooled Ts", 
			description="Last Api Spooled Ts")
			@Section(name = "OTA")
			
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastApiSpooledTs;
	private Instant lastApiSuccessTs;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Last Tested Stk Impl", 
			description="Last Tested Stk Impl")
			@Section(name = "STK")
	@TargetClass(type=ClassType.ENUM, name="AppletImpl")
	private AppletImpl lastTestedStkImpl;
	
	public final Long getCounter() {
		return counter;
	}
	public final void setCounter(Long counter) {
		this.counter = counter;
	}
	public final String getIccid() {
		return iccid;
	}
	public final void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public final String getImsi() {
		return imsi;
	}
	public final void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public final String getMsisdn() {
		return msisdn;
	}
	public final void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public final String getImei() {
		return imei;
	}
	public final void setImei(String imei) {
		this.imei = imei;
	}
	public final Integer getMcc() {
		return mcc;
	}
	public final void setMcc(Integer mcc) {
		this.mcc = mcc;
	}
	public final Integer getMnc() {
		return mnc;
	}
	public final void setMnc(Integer mnc) {
		this.mnc = mnc;
	}
	public final Long getLactac() {
		return lactac;
	}
	public final void setLactac(Long lactac) {
		this.lactac = lactac;
	}
	public final Long getCellId() {
		return cellId;
	}
	public final void setCellId(Long cellId) {
		this.cellId = cellId;
	}
	public final AppletImpl getStkImpl() {
		return stkImpl;
	}
	public final void setStkImpl(AppletImpl stkImpl) {
		this.stkImpl = stkImpl;
	}
	public final Instant getMsisdnValidUntilTs() {
		return msisdnValidUntilTs;
	}
	public final void setMsisdnValidUntilTs(Instant msisdnValidUntilTs) {
		this.msisdnValidUntilTs = msisdnValidUntilTs;
	}
	public final Instant getLastSeenAliveTs() {
		return lastSeenAliveTs;
	}
	public final void setLastSeenAliveTs(Instant lastSeenAliveTs) {
		this.lastSeenAliveTs = lastSeenAliveTs;
	}
	public final Double getLatitude() {
		return latitude;
	}
	public final void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public final Double getLongitude() {
		return longitude;
	}
	public final void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public final Integer getBrowserVersion() {
		return browserVersion;
	}
	public final void setBrowserVersion(Integer browserVersion) {
		this.browserVersion = browserVersion;
	}
	public final Integer getSleepySessionIdIndex() {
		return sleepySessionIdIndex;
	}
	public final void setSleepySessionIdIndex(Integer sleepySessionIdIndex) {
		this.sleepySessionIdIndex = sleepySessionIdIndex;
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
	private Instant lastInteractiveSentTs;
	public Instant getLastInteractiveSentTs() {
		return lastInteractiveSentTs;
	}
	public void setLastInteractiveSentTs(Instant lastInteractiveSentTs) {
		this.lastInteractiveSentTs = lastInteractiveSentTs;
	}
	private Instant nextInteractiveScheduleTs;
	public Instant getNextInteractiveScheduleTs() {
		return nextInteractiveScheduleTs;
	}
	public void setNextInteractiveScheduleTs(Instant nextInteractiveScheduleTs) {
		this.nextInteractiveScheduleTs = nextInteractiveScheduleTs;
	}
	private Instant lastInteractiveSuccessTs;
	public Instant getLastInteractiveSuccessTs() {
		return lastInteractiveSuccessTs;
	}
	public void setLastInteractiveSuccessTs(Instant lastInteractiveSuccessTs) {
		this.lastInteractiveSuccessTs = lastInteractiveSuccessTs;
	}
	public Instant getLastDiscoverySentTs() {
		return lastDiscoverySentTs;
	}
	public void setLastDiscoverySentTs(Instant lastDiscoverySentTs) {
		this.lastDiscoverySentTs = lastDiscoverySentTs;
	}
	public Instant getNextDiscoveryScheduleTs() {
		return nextDiscoveryScheduleTs;
	}
	public void setNextDiscoveryScheduleTs(Instant nextDiscoveryScheduleTs) {
		this.nextDiscoveryScheduleTs = nextDiscoveryScheduleTs;
	}
	public Instant getLastDiscoverySuccessTs() {
		return lastDiscoverySuccessTs;
	}
	public void setLastDiscoverySuccessTs(Instant lastDiscoverySuccessTs) {
		this.lastDiscoverySuccessTs = lastDiscoverySuccessTs;
	}
	public Instant getLastPermanentSentTs() {
		return lastPermanentSentTs;
	}
	public void setLastPermanentSentTs(Instant lastPermanentSentTs) {
		this.lastPermanentSentTs = lastPermanentSentTs;
	}
	public Instant getNextPermanentScheduleTs() {
		return nextPermanentScheduleTs;
	}
	public void setNextPermanentScheduleTs(Instant nextPermanentScheduleTs) {
		this.nextPermanentScheduleTs = nextPermanentScheduleTs;
	}
	public Instant getLastPermanentSuccessTs() {
		return lastPermanentSuccessTs;
	}
	public void setLastPermanentSuccessTs(Instant lastPermanentSuccessTs) {
		this.lastPermanentSuccessTs = lastPermanentSuccessTs;
	}
	public Instant getLastApiSentTs() {
		return lastApiSentTs;
	}
	public void setLastApiSentTs(Instant lastApiSentTs) {
		this.lastApiSentTs = lastApiSentTs;
	}
	public Instant getLastApiSpooledTs() {
		return lastApiSpooledTs;
	}
	public void setLastApiSpooledTs(Instant lastApiSpooledTs) {
		this.lastApiSpooledTs = lastApiSpooledTs;
	}
	public Instant getLastApiSuccessTs() {
		return lastApiSuccessTs;
	}
	public void setLastApiSuccessTs(Instant lastApiSuccessTs) {
		this.lastApiSuccessTs = lastApiSuccessTs;
	}
	public AppletImpl getLastTestedStkImpl() {
		return lastTestedStkImpl;
	}
	public void setLastTestedStkImpl(AppletImpl lastTestedStkImpl) {
		this.lastTestedStkImpl = lastTestedStkImpl;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getStkApplet() {
		return stkApplet;
	}
	public void setStkApplet(Long stkApplet) {
		this.stkApplet = stkApplet;
	}
	public Long getSimProfile() {
		return simProfile;
	}
	public void setSimProfile(Long simProfile) {
		this.simProfile = simProfile;
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
	public Instant getLastP3SuccessTs() {
		return lastP3SuccessTs;
	}
	public void setLastP3SuccessTs(Instant lastP3SuccessTs) {
		this.lastP3SuccessTs = lastP3SuccessTs;
	}
	public Instant getLastP4SuccessTs() {
		return lastP4SuccessTs;
	}
	public void setLastP4SuccessTs(Instant lastP4SuccessTs) {
		this.lastP4SuccessTs = lastP4SuccessTs;
	}
	public Instant getLastP5SuccessTs() {
		return lastP5SuccessTs;
	}
	public void setLastP5SuccessTs(Instant lastP5SuccessTs) {
		this.lastP5SuccessTs = lastP5SuccessTs;
	}
	
	
	
	
}
