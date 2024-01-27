package com.mobiera.aircast.api.v1.stats;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.stats.CampaignPreviewVO;

@JsonInclude(Include.NON_NULL)
public class GetCampaignPreviewRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private GetCampaignPreviewRequestResult result;
	private String errorMessage;
	private CampaignPreviewVO campaignPreview;
	
	public GetCampaignPreviewRequestResult getResult() {
		return result;
	}
	public void setResult(GetCampaignPreviewRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public CampaignPreviewVO getCampaignPreview() {
		return campaignPreview;
	}
	public void setCampaignPreview(CampaignPreviewVO campaignPreview) {
		this.campaignPreview = campaignPreview;
	}
	
	

}
