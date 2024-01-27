package com.mobiera.aircast.api.v1.campaign_schedule;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.CampaignScheduleVO;

@JsonInclude(Include.NON_NULL)
public class ListCampaignSchedulesRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListCampaignSchedulesRequestResult result;
	private String errorMessage;
	private List<CampaignScheduleVO> campaignSchedules;
	public ListCampaignSchedulesRequestResult getResult() {
		return result;
	}
	public void setResult(ListCampaignSchedulesRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<CampaignScheduleVO> getCampaignSchedules() {
		return campaignSchedules;
	}
	public void setCampaignSchedules(List<CampaignScheduleVO> campaignSchedules) {
		this.campaignSchedules = campaignSchedules;
	}
	


}
