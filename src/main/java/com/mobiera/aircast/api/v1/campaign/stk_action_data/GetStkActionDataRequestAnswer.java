package com.mobiera.aircast.api.v1.campaign.stk_action_data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.StkActionDataVO;

@JsonInclude(Include.NON_NULL)
public class GetStkActionDataRequestAnswer implements Serializable
{
	private static final long serialVersionUID = 9097798713620249354L;
	private GetStkActionDataRequestResult result;
	private String errorMessage;
	private StkActionDataVO stkActionData;
	public GetStkActionDataRequestResult getResult() {
		return result;
	}
	public void setResult(GetStkActionDataRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public StkActionDataVO getStkActionData() {
		return stkActionData;
	}
	public void setStkActionData(StkActionDataVO stkActionData) {
		this.stkActionData = stkActionData;
	}
	
	
	
}
