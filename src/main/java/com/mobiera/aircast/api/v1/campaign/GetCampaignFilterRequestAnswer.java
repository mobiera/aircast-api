package com.mobiera.aircast.api.v1.campaign;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.CampaignFilter;

@JsonInclude(Include.NON_NULL)
public class GetCampaignFilterRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3297798713620249354L;
	private GetCampaignFilterRequestResult result;
	private String errorMessage;
	private List<CampaignFilter> filters;
	public GetCampaignFilterRequestResult getResult() {
		return result;
	}
	public void setResult(GetCampaignFilterRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<CampaignFilter> getFilters() {
		return filters;
	}
	public void setFilters(List<CampaignFilter> filters) {
		this.filters = filters;
	}
	


}
