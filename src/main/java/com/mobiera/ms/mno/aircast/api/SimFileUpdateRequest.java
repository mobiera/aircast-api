package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.CampaignManagement;

@JsonInclude(Include.NON_NULL)
public class SimFileUpdateRequest implements Serializable {

	private static final long serialVersionUID = -4775901422035543388L;
	
	private Long campaignId;
	

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	
	
    
    
    
	
	
}
