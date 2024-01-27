package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CampaignExecutionVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5467345816640819350L;
	
	private Long campaignId;
	private Map<Long, Long> selectedText;
	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	public Map<Long, Long> getSelectedText() {
		return selectedText;
	}
	public void setSelectedText(Map<Long, Long> selectedText) {
		this.selectedText = selectedText;
	}
	
	
	
	

}
