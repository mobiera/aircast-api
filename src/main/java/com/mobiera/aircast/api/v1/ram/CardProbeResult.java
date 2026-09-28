package com.mobiera.aircast.api.v1.ram;

import java.io.Serializable;

/**
 * What a card probe (RamCommand.CARD_PROBE) read on a sim, sent by cm to sim-ota at the end of
 * the session. A value the card did not give is null.
 */
public class CardProbeResult implements Serializable {

	private static final long serialVersionUID = 1L;

	private String msisdn;
	/** Probe campaign, holder of the sim lock **/
	private Long campaignFk;
	private Integer installedApplications;
	/** Bytes **/
	private Integer freeNonVolatileMemory;
	/** Bytes **/
	private Integer freeVolatileMemory;
	/** Hex **/
	private String keyDiversificationData;
	/** Hex, content of the key information template **/
	private String keyInformation;

	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Long getCampaignFk() {
		return campaignFk;
	}
	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}
	public Integer getInstalledApplications() {
		return installedApplications;
	}
	public void setInstalledApplications(Integer installedApplications) {
		this.installedApplications = installedApplications;
	}
	public Integer getFreeNonVolatileMemory() {
		return freeNonVolatileMemory;
	}
	public void setFreeNonVolatileMemory(Integer freeNonVolatileMemory) {
		this.freeNonVolatileMemory = freeNonVolatileMemory;
	}
	public Integer getFreeVolatileMemory() {
		return freeVolatileMemory;
	}
	public void setFreeVolatileMemory(Integer freeVolatileMemory) {
		this.freeVolatileMemory = freeVolatileMemory;
	}
	public String getKeyDiversificationData() {
		return keyDiversificationData;
	}
	public void setKeyDiversificationData(String keyDiversificationData) {
		this.keyDiversificationData = keyDiversificationData;
	}
	public String getKeyInformation() {
		return keyInformation;
	}
	public void setKeyInformation(String keyInformation) {
		this.keyInformation = keyInformation;
	}
}
