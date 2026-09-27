package com.mobiera.aircast.api.v1.ram;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Asks sim-ota for sims available to a permanent RAM (applet management) campaign: OTA
 * schedule due, sim not locked, msisdn valid, OTA keys present, sim profile in the list.
 * Selected sims are locked for the campaign and their next OTA schedule is pushed by the
 * permanent interval.
 */
@JsonInclude(Include.NON_NULL)
public class OtaSelectRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Campaign the sims are selected for, becomes the lock holder **/
	private Long campaignFk;
	/** Sim profiles the campaign has parameters for **/
	private List<Long> simProfileFks;
	private Integer qty;
	/** Duration of the lock taken on each selected sim **/
	private Long lockMillis;

	public Long getCampaignFk() {
		return campaignFk;
	}
	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}
	public List<Long> getSimProfileFks() {
		return simProfileFks;
	}
	public void setSimProfileFks(List<Long> simProfileFks) {
		this.simProfileFks = simProfileFks;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Long getLockMillis() {
		return lockMillis;
	}
	public void setLockMillis(Long lockMillis) {
		this.lockMillis = lockMillis;
	}
}
