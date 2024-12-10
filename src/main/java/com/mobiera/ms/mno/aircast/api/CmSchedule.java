package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CmSchedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -946202575092205395L;
	
	private Long csId;
	private Long campaignFk;
	private Integer limit;
	private Integer missing;
	private Integer registeredCmInstances;
	private Boolean onlyIfNoPa;
	private String userId;
	private String groupId;
	
	public Long getCampaignFk() {
		return campaignFk;
	}
	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getMissing() {
		return missing;
	}
	public void setMissing(Integer missing) {
		this.missing = missing;
	}
	public Long getCsId() {
		return csId;
	}
	public void setCsId(Long csId) {
		this.csId = csId;
	}
	public Integer getRegisteredCmInstances() {
		return registeredCmInstances;
	}
	public void setRegisteredCmInstances(Integer registeredCmInstances) {
		this.registeredCmInstances = registeredCmInstances;
	}
	public Boolean getOnlyIfNoPa() {
		return onlyIfNoPa;
	}
	public void setOnlyIfNoPa(Boolean onlyIfNoPa) {
		this.onlyIfNoPa = onlyIfNoPa;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
}
