package com.mobiera.aircast.api.v1.campaign_schedule;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.CampaignScheduleVO;

@JsonInclude(Include.NON_NULL)
public class SaveCampaignScheduleRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private SaveCampaignScheduleRequestResult result;
	private String errorMessage;
	private CampaignScheduleVO campaignSchedule;
	public SaveCampaignScheduleRequestResult getResult() {
		return result;
	}
	public void setResult(SaveCampaignScheduleRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public CampaignScheduleVO getCampaignSchedule() {
		return campaignSchedule;
	}
	public void setCampaignSchedule(CampaignScheduleVO campaignSchedule) {
		this.campaignSchedule = campaignSchedule;
	}
	
	
}
