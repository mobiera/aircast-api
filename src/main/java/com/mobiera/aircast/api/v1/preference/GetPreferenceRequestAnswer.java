package com.mobiera.aircast.api.v1.preference;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.PreferenceVO;

@JsonInclude(Include.NON_NULL)
public class GetPreferenceRequestAnswer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8747838349299308322L;
	private GetPreferenceRequestResult result;
	private String errorMessage;
	private PreferenceVO preference;
	
	public GetPreferenceRequestResult getResult() {
		return result;
	}
	public void setResult(GetPreferenceRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public PreferenceVO getPreference() {
		return preference;
	}
	public void setPreference(PreferenceVO preference) {
		this.preference = preference;
	}
	
	

}
