package com.mobiera.aircast.api.v1.simstats;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.StatViewVO_v2;
import com.mobiera.ms.mno.aircast.api.SimStatVO;

@JsonInclude(Include.NON_NULL)
public class ListSimStatVOsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private ListSimStatVOsRequestResult result;
	private String errorMessage;
	private List<SimStatVO> stats;
	public ListSimStatVOsRequestResult getResult() {
		return result;
	}
	public void setResult(ListSimStatVOsRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<SimStatVO> getStats() {
		return stats;
	}
	public void setStats(List<SimStatVO> stats) {
		this.stats = stats;
	}
	
	

}
