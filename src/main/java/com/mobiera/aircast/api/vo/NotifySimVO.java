
package com.mobiera.aircast.api.vo;


import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.AppletImpl;
import com.mobiera.aircast.commons.enums.DeviceOs;
import com.mobiera.aircast.commons.enums.DeviceType;
import com.mobiera.aircast.commons.enums.SubscriberPlan;
import com.mobiera.aircast.commons.enums.SubscriberType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class NotifySimVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5829352845298862370L;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	private Long id;
	
	private String iccid;
	private String imsi;
	private String msisdn;
	private String imei;
	private AppletImpl stkImpl;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant msisdnValidUntilTs;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastSeenAliveTs;
	
	private Integer browserVersion;
	private String simProfileName;
	private Long simProfileId;
	private DeviceType gatheredType;
	private DeviceOs gatheredOs;
	private Boolean smartDevice;
	private Boolean stkDisplayTextHighPriority;
	private Boolean stkDisplayTextHighPriorityWhenFirstCommand;
	private Boolean stkDisplayTextLowPriority;
	private Boolean stkSelectItem;
	private Boolean stkGetInput;
	private Boolean stkGetInputPassword;
	private Boolean stkSetupCall;
	private Boolean stkSetupCallTitle;
	private Boolean stkSendUssd;
	private Boolean stkSendUssdTitle;
	private Boolean stkLaunchBrowser;
	private Boolean stkLaunchBrowserTitle;
	private SubscriberType subscriberType;
	private SubscriberPlan subscriberPlan;
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant subscriberSinceTs;
	private Boolean mnoAdAllowed;
	private Boolean tpAdAllowed;
	
	
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
	public final Integer getBrowserVersion() {
		return browserVersion;
	}
	public final void setBrowserVersion(Integer browserVersion) {
		this.browserVersion = browserVersion;
	}
	public final String getSimProfileName() {
		return simProfileName;
	}
	public final void setSimProfileName(String simProfileName) {
		this.simProfileName = simProfileName;
	}
	public final Long getSimProfileId() {
		return simProfileId;
	}
	public final void setSimProfileId(Long simProfileId) {
		this.simProfileId = simProfileId;
	}
	public final DeviceType getGatheredType() {
		return gatheredType;
	}
	public final void setGatheredType(DeviceType gatheredType) {
		this.gatheredType = gatheredType;
	}
	public final DeviceOs getGatheredOs() {
		return gatheredOs;
	}
	public final void setGatheredOs(DeviceOs gatheredOs) {
		this.gatheredOs = gatheredOs;
	}
	public final Boolean getSmartDevice() {
		return smartDevice;
	}
	public final void setSmartDevice(Boolean smartDevice) {
		this.smartDevice = smartDevice;
	}
	public final Boolean getStkDisplayTextHighPriority() {
		return stkDisplayTextHighPriority;
	}
	public final void setStkDisplayTextHighPriority(Boolean stkDisplayTextHighPriority) {
		this.stkDisplayTextHighPriority = stkDisplayTextHighPriority;
	}
	public final Boolean getStkDisplayTextHighPriorityWhenFirstCommand() {
		return stkDisplayTextHighPriorityWhenFirstCommand;
	}
	public final void setStkDisplayTextHighPriorityWhenFirstCommand(Boolean stkDisplayTextHighPriorityWhenFirstCommand) {
		this.stkDisplayTextHighPriorityWhenFirstCommand = stkDisplayTextHighPriorityWhenFirstCommand;
	}
	public final Boolean getStkDisplayTextLowPriority() {
		return stkDisplayTextLowPriority;
	}
	public final void setStkDisplayTextLowPriority(Boolean stkDisplayTextLowPriority) {
		this.stkDisplayTextLowPriority = stkDisplayTextLowPriority;
	}
	public final Boolean getStkSelectItem() {
		return stkSelectItem;
	}
	public final void setStkSelectItem(Boolean stkSelectItem) {
		this.stkSelectItem = stkSelectItem;
	}
	public final Boolean getStkGetInput() {
		return stkGetInput;
	}
	public final void setStkGetInput(Boolean stkGetInput) {
		this.stkGetInput = stkGetInput;
	}
	public final Boolean getStkGetInputPassword() {
		return stkGetInputPassword;
	}
	public final void setStkGetInputPassword(Boolean stkGetInputPassword) {
		this.stkGetInputPassword = stkGetInputPassword;
	}
	public final Boolean getStkSetupCall() {
		return stkSetupCall;
	}
	public final void setStkSetupCall(Boolean stkSetupCall) {
		this.stkSetupCall = stkSetupCall;
	}
	public final Boolean getStkSetupCallTitle() {
		return stkSetupCallTitle;
	}
	public final void setStkSetupCallTitle(Boolean stkSetupCallTitle) {
		this.stkSetupCallTitle = stkSetupCallTitle;
	}
	public final Boolean getStkSendUssd() {
		return stkSendUssd;
	}
	public final void setStkSendUssd(Boolean stkSendUssd) {
		this.stkSendUssd = stkSendUssd;
	}
	public final Boolean getStkSendUssdTitle() {
		return stkSendUssdTitle;
	}
	public final void setStkSendUssdTitle(Boolean stkSendUssdTitle) {
		this.stkSendUssdTitle = stkSendUssdTitle;
	}
	public final Boolean getStkLaunchBrowser() {
		return stkLaunchBrowser;
	}
	public final void setStkLaunchBrowser(Boolean stkLaunchBrowser) {
		this.stkLaunchBrowser = stkLaunchBrowser;
	}
	public final Boolean getStkLaunchBrowserTitle() {
		return stkLaunchBrowserTitle;
	}
	public final void setStkLaunchBrowserTitle(Boolean stkLaunchBrowserTitle) {
		this.stkLaunchBrowserTitle = stkLaunchBrowserTitle;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
