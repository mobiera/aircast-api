package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CampaignUserListData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -146202575092205395L;
	
	private Long campaignFk;
	//private String customFields;
	private List<String> userListData;
	private String error;
	
	public CampaignUserListData(String error) {
		this.error = error;
		
	}
	public CampaignUserListData() {
		
		
	}
	public Long getCampaignFk() {
		return campaignFk;
	}
	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}
	
	public List<String> getUserListData() {
		return userListData;
	}
	public void setUserListData(List<String> userListData) {
		this.userListData = userListData;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	
}
