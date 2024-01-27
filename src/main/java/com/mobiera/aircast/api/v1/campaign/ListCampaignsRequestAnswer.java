package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.CampaignVO;

@JsonInclude(Include.NON_NULL)
public class ListCampaignsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListCampaignsRequestResult result;
	private String errorMessage;
	private List<CampaignVO> campaigns;
	public final ListCampaignsRequestResult getResult() {
		return result;
	}
	public final void setResult(ListCampaignsRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final List<CampaignVO> getCampaigns() {
		return campaigns;
	}
	public final void setCampaigns(List<CampaignVO> campaigns) {
		this.campaigns = campaigns;
	}
	
	
	


}
