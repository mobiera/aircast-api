package com.mobiera.aircast.api.v1.node;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.stats.DashboardVO;

@JsonInclude(Include.NON_NULL)
public class GetDashboardRequestAnswer implements Serializable {


	private static final long serialVersionUID = 7944962553757092867L;
	
	private GetDashboardRequestResult result;
	private String errorMessage;
	private DashboardVO dashboard;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public GetDashboardRequestResult getResult() {
		return result;
	}
	public void setResult(GetDashboardRequestResult result) {
		this.result = result;
	}
	public DashboardVO getDashboard() {
		return dashboard;
	}
	public void setDashboard(DashboardVO dashboard) {
		this.dashboard = dashboard;
	}
	

	
}
