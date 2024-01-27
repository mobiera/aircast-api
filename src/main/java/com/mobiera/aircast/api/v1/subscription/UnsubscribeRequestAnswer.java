package com.mobiera.aircast.api.v1.subscription;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.PreferenceVO;

@JsonInclude(Include.NON_NULL)
public class UnsubscribeRequestAnswer implements Serializable {

	private static final long serialVersionUID = -6199230095358309952L;
	
	private UnsubscribeRequestResult result;
	private String errorMessage;

	public final UnsubscribeRequestResult getResult() {
		return result;
	}
	public final void setResult(UnsubscribeRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

}
