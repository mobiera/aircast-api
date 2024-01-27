package com.mobiera.aircast.api.v1.generic_entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.AppletVO;
import com.mobiera.aircast.api.vo.CampaignVO;
import com.mobiera.aircast.api.vo.EndpointVO;

@JsonInclude(Include.NON_NULL)
public class CloneEntityRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3297798713620249354L;
	private CloneEntityRequestResult result;
	private String errorMessage;
	private Long clonedEntityId;
	
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public CloneEntityRequestResult getResult() {
		return result;
	}
	public void setResult(CloneEntityRequestResult result) {
		this.result = result;
	}
	public Long getClonedEntityId() {
		return clonedEntityId;
	}
	public void setClonedEntityId(Long clonedEntityId) {
		this.clonedEntityId = clonedEntityId;
	}
	
	
	
	


}
