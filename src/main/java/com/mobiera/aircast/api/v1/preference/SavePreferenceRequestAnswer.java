package com.mobiera.aircast.api.v1.preference;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.PreferenceVO;

@JsonInclude(Include.NON_NULL)
public class SavePreferenceRequestAnswer implements Serializable {

	private static final long serialVersionUID = -6199230095358309952L;
	
	private SavePreferenceRequestResult result;
	private String errorMessage;
	private PreferenceVO preference;
	public final SavePreferenceRequestResult getResult() {
		return result;
	}
	public final void setResult(SavePreferenceRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public PreferenceVO getUserParameter() {
		return preference;
	}
	public void setUserParameter(PreferenceVO userParameter) {
		this.preference = userParameter;
	}
	

}
