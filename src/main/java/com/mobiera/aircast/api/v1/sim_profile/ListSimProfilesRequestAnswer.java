package com.mobiera.aircast.api.v1.sim_profile;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SimProfileVO;

@JsonInclude(Include.NON_NULL)
public class ListSimProfilesRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListSimProfilesRequestResult result;
	private String errorMessage;
	private List<SimProfileVO> simProfiles;
	public final ListSimProfilesRequestResult getResult() {
		return result;
	}
	public final void setResult(ListSimProfilesRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final List<SimProfileVO> getSimProfiles() {
		return simProfiles;
	}
	public final void setSimProfiles(List<SimProfileVO> simProfiles) {
		this.simProfiles = simProfiles;
	}
	
	
	


}
