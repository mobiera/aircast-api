package com.mobiera.aircast.api.v1.smpp_account;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SmppAccountVO;

@JsonInclude(Include.NON_NULL)
public class ListSmppAccountsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListSmppAccountsRequestResult result;
	private String errorMessage;
	private List<SmppAccountVO> smppAccounts;
	public final ListSmppAccountsRequestResult getResult() {
		return result;
	}
	public final void setResult(ListSmppAccountsRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final List<SmppAccountVO> getSmppAccounts() {
		return smppAccounts;
	}
	public final void setSmppAccounts(List<SmppAccountVO> smppAccounts) {
		this.smppAccounts = smppAccounts;
	}
	
	
	


}
