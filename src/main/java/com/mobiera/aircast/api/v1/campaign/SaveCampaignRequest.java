package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.CampaignVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveCampaignRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private CampaignVO campaign;
	@JsonIgnore
	private UserContextVO userContext;
	
	public final CampaignVO getCampaign() {
		return campaign;
	}
	public final void setCampaign(CampaignVO campaign) {
		this.campaign = campaign;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	

	
	
}
