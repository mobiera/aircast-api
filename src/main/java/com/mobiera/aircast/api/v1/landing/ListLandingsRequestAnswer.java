package com.mobiera.aircast.api.v1.landing;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.LandingVO;

@JsonInclude(Include.NON_NULL)
public class ListLandingsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListLandingsRequestResult result;
	private String errorMessage;
	private List<LandingVO> landings;
	public final ListLandingsRequestResult getResult() {
		return result;
	}
	public final void setResult(ListLandingsRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<LandingVO> getLandings() {
		return landings;
	}
	public void setLandings(List<LandingVO> landings) {
		this.landings = landings;
	}
	
	
	
	
	


}
