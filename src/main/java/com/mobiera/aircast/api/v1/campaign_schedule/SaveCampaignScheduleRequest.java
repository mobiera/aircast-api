package com.mobiera.aircast.api.v1.campaign_schedule;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.CampaignScheduleVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveCampaignScheduleRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private CampaignScheduleVO campaignSchedule;
	@JsonIgnore
	private UserContextVO userContext;
	
	public CampaignScheduleVO getCampaignSchedule() {
		return campaignSchedule;
	}
	public void setCampaignSchedule(CampaignScheduleVO campaignSchedule) {
		this.campaignSchedule = campaignSchedule;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	
	
	
}
