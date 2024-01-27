package com.mobiera.ms.mno.aircast.api.v1.stats;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GetEntityKpiRequestAnswer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1016426329097213768L;
	private GetEntityKpiRequestResult result;
	private String errorMessage;
	private List<String> entityKpis;
	
	public GetEntityKpiRequestResult getResult() {
		return result;
	}
	public void setResult(GetEntityKpiRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<String> getEntityKpis() {
		return entityKpis;
	}
	public void setEntityKpis(List<String> entityKpis) {
		this.entityKpis = entityKpis;
	}

}
