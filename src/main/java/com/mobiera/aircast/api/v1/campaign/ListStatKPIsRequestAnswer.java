package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.ms.commons.stats.api.Kpi;

@JsonInclude(Include.NON_NULL)
public class ListStatKPIsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListStatKPIsRequestResult result;
	private String errorMessage;
	private List<Kpi> kpis;
	public ListStatKPIsRequestResult getResult() {
		return result;
	}
	public void setResult(ListStatKPIsRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<Kpi> getKpis() {
		return kpis;
	}
	public void setKpis(List<Kpi> kpis) {
		this.kpis = kpis;
	}
	
	
	


}
