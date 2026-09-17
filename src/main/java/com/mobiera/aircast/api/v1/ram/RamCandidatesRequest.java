package com.mobiera.aircast.api.v1.ram;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.List;

/**
 * Asks sim-ota for sims eligible to a RAM campaign: matching profile, OTA keys present, applet not yet installed.
 */
@JsonInclude(Include.NON_NULL)
public class RamCandidatesRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long campaignId;
	/** Sim profiles the campaign has install parameters for **/
	private List<Long> simProfileFks;
	/** Applet provided on success; sims already holding it are skipped. May be null **/
	private Long appletFk;
	private Integer qty;
	/** Selected sims are not returned again before this delay **/
	private Long rescheduleAfterMillis;

	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public List<Long> getSimProfileFks() {
		return simProfileFks;
	}
	public void setSimProfileFks(List<Long> simProfileFks) {
		this.simProfileFks = simProfileFks;
	}

	public Long getAppletFk() {
		return appletFk;
	}
	public void setAppletFk(Long appletFk) {
		this.appletFk = appletFk;
	}

	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Long getRescheduleAfterMillis() {
		return rescheduleAfterMillis;
	}
	public void setRescheduleAfterMillis(Long rescheduleAfterMillis) {
		this.rescheduleAfterMillis = rescheduleAfterMillis;
	}

}
