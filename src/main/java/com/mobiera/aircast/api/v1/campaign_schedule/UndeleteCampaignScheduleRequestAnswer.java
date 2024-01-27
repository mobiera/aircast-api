package com.mobiera.aircast.api.v1.campaign_schedule;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.CampaignScheduleVO;

@JsonInclude(Include.NON_NULL)
public class UndeleteCampaignScheduleRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3297798713620249354L;
	private UndeleteCampaignScheduleRequestResult result;
	private String errorMessage;
	private CampaignScheduleVO campaignSchedule;
	
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public CampaignScheduleVO getCampaignSchedule() {
		return campaignSchedule;
	}
	public void setCampaignSchedule(CampaignScheduleVO campaignSchedule) {
		this.campaignSchedule = campaignSchedule;
	}
	public UndeleteCampaignScheduleRequestResult getResult() {
		return result;
	}
	public void setResult(UndeleteCampaignScheduleRequestResult result) {
		this.result = result;
	}
	
	


}
