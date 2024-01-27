package com.mobiera.aircast.api.vo;


import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mobiera.aircast.commons.enums.DeviceOs;
import com.mobiera.aircast.commons.enums.DeviceType;
import com.mobiera.commons.util.InstantDeserializer;
import com.mobiera.commons.util.InstantSerializer;

@JsonInclude(Include.NON_NULL)
public class DeviceVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4829355845298862370L;

	private String tac;
	private String brand;
	private String name;
	private String model;
	private String type;
	private String os;
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
	
	@JsonSerialize(using = InstantSerializer.class)
	@JsonDeserialize(using = InstantDeserializer.class)
	private Instant lastUpdatedTs;
	public final String getTac() {
		return tac;
	}
	public final void setTac(String tac) {
		this.tac = tac;
	}
	public final String getBrand() {
		return brand;
	}
	public final void setBrand(String brand) {
		this.brand = brand;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getModel() {
		return model;
	}
	public final void setModel(String model) {
		this.model = model;
	}
	public final String getType() {
		return type;
	}
	public final void setType(String type) {
		this.type = type;
	}
	public final DeviceType getGatheredType() {
		return gatheredType;
	}
	public final void setGatheredType(DeviceType gatheredType) {
		this.gatheredType = gatheredType;
	}
	public final String getOs() {
		return os;
	}
	public final void setOs(String os) {
		this.os = os;
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
	public final Instant getLastUpdatedTs() {
		return lastUpdatedTs;
	}
	public final void setLastUpdatedTs(Instant lastUpdatedTs) {
		this.lastUpdatedTs = lastUpdatedTs;
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
	
	
}
