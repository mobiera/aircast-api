package com.mobiera.aircast.api.vo.stats;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.Label;

@JsonInclude(Include.NON_NULL)
@Label(singular="Dashboard", plural="Dashboards")
@Description(data="Dashboard for a quick overview of this Aircast Node.")
public class DashboardVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5440297035329929531L;
	private DiscoveryPreviewVO discoveryPreview;
	private List<ResidentPreviewVO> residentPreviews;
	private List<SimOsPreviewVO> simOsPreviews;
	private List<ScheduledPreviewVO> scheduledPreviews;
	private List<ApiPreviewVO> apiPreviews;
	
	
	public DiscoveryPreviewVO getDiscoveryPreview() {
		return discoveryPreview;
	}
	public void setDiscoveryPreview(DiscoveryPreviewVO discoveryPreview) {
		this.discoveryPreview = discoveryPreview;
	}
	public List<ResidentPreviewVO> getResidentPreviews() {
		return residentPreviews;
	}
	public void setResidentPreviews(List<ResidentPreviewVO> residentPreviews) {
		this.residentPreviews = residentPreviews;
	}
	public List<SimOsPreviewVO> getSimOsPreviews() {
		return simOsPreviews;
	}
	public void setSimOsPreviews(List<SimOsPreviewVO> simOsPreviews) {
		this.simOsPreviews = simOsPreviews;
	}
	public List<ScheduledPreviewVO> getScheduledPreviews() {
		return scheduledPreviews;
	}
	public void setScheduledPreviews(List<ScheduledPreviewVO> scheduledPreviews) {
		this.scheduledPreviews = scheduledPreviews;
	}
	public List<ApiPreviewVO> getApiPreviews() {
		return apiPreviews;
	}
	public void setApiPreviews(List<ApiPreviewVO> apiPreviews) {
		this.apiPreviews = apiPreviews;
	}
	
	
	
	
	
	
	
}
