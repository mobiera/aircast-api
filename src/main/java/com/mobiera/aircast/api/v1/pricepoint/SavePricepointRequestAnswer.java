package com.mobiera.aircast.api.v1.pricepoint;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.PricepointVO;

@JsonInclude(Include.NON_NULL)
public class SavePricepointRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private SavePricepointRequestResult result;
	private String errorMessage;
	private PricepointVO pricepoint;
	public final SavePricepointRequestResult getResult() {
		return result;
	}
	public final void setResult(SavePricepointRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final PricepointVO getPricepoint() {
		return pricepoint;
	}
	public final void setPricepoint(PricepointVO pricepoint) {
		this.pricepoint = pricepoint;
	}
	
}
