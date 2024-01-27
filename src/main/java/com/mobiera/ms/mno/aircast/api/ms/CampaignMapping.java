package com.mobiera.ms.mno.aircast.api.ms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CampaignMapping {
	Long campaignFk;
	Long smppAccountFk;
	public Long getCampaignFk() {
		return campaignFk;
	}
	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}
	public Long getSmppAccountFk() {
		return smppAccountFk;
	}
	public void setSmppAccountFk(Long smppAccountFk) {
		this.smppAccountFk = smppAccountFk;
	}
}
