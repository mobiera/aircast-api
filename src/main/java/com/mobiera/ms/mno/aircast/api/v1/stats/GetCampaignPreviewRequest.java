package com.mobiera.ms.mno.aircast.api.v1.stats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GetCampaignPreviewRequest implements Serializable
{
	
	
	private static final long serialVersionUID = 1241061034966633284L;
	
	private Long campaignId;

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	
}
