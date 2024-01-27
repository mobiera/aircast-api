package com.mobiera.aircast.api.v1.sim_profile;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SimProfileVO;

@JsonInclude(Include.NON_NULL)
public class SaveSimProfileRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private SaveSimProfileRequestResult result;
	private String errorMessage;
	private SimProfileVO simProfile;
	
	public SimProfileVO getSimProfile() {
		return simProfile;
	}
	public void setSimProfile(SimProfileVO simProfile) {
		this.simProfile = simProfile;
	}
	public SaveSimProfileRequestResult getResult() {
		return result;
	}
	public void setResult(SaveSimProfileRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	


}
