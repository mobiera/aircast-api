package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.CampaignVO;

@JsonInclude(Include.NON_NULL)
public class UpdateAvailableUsersRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3297798713620249354L;
	private UpdateAvailableUsersRequestResult result;
	private String errorMessage;
	public UpdateAvailableUsersRequestResult getResult() {
		return result;
	}
	public void setResult(UpdateAvailableUsersRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	


}
