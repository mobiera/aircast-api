package com.mobiera.aircast.api.v1.pricepoint;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.PricepointVO;

@JsonInclude(Include.NON_NULL)
public class ListPricepointsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListPricepointsRequestResult result;
	private String errorMessage;
	private List<PricepointVO> pricepoints;
	public final ListPricepointsRequestResult getResult() {
		return result;
	}
	public final void setResult(ListPricepointsRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final List<PricepointVO> getPricepoints() {
		return pricepoints;
	}
	public final void setPricepoints(List<PricepointVO> pricepoints) {
		this.pricepoints = pricepoints;
	}
	
	
	


}
