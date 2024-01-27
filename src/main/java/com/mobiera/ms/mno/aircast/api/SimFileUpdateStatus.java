package com.mobiera.ms.mno.aircast.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.CampaignManagement;

@JsonInclude(Include.NON_NULL)
public class SimFileUpdateStatus implements Serializable {

	private static final long serialVersionUID = -4775901422035543388L;
	
	private Long campaignId;
	
	private Long impactables = 0l;
	private Long alives = 0l;
	private Long done = 0l;
	private Boolean finished = false;;
	private Boolean aborted = false;
	private String errorMsg;
	
	public Long getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	
	public Long getImpactables() {
		return impactables;
	}
	public void setImpactables(Long impactables) {
		this.impactables = impactables;
	}
	public Long getAlives() {
		return alives;
	}
	public void setAlives(Long alives) {
		this.alives = alives;
	}
	public Long getDone() {
		return done;
	}
	public void setDone(Long done) {
		this.done = done;
	}
	public Boolean getFinished() {
		return finished;
	}
	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	public Boolean getAborted() {
		return aborted;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public void setAborted(Boolean aborted) {
		this.aborted = aborted;
	}
    
    
    
	
	
}
