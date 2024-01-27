package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.CampaignVO;

@JsonInclude(Include.NON_NULL)
public class SaveCampaignRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private SaveCampaignRequestResult result;
	private String errorMessage;
	private CampaignVO campaign;
	public final SaveCampaignRequestResult getResult() {
		return result;
	}
	public final void setResult(SaveCampaignRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final CampaignVO getCampaign() {
		return campaign;
	}
	public final void setCampaign(CampaignVO campaign) {
		this.campaign = campaign;
	}
	
}
