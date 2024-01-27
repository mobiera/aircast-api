package com.mobiera.aircast.api.v1.smpp_account;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SmppAccountVO;

@JsonInclude(Include.NON_NULL)
public class SaveSmppAccountRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private SaveSmppAccountRequestResult result;
	private String errorMessage;
	private SmppAccountVO smppAccount;
	public final SaveSmppAccountRequestResult getResult() {
		return result;
	}
	public final void setResult(SaveSmppAccountRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final SmppAccountVO getSmppAccount() {
		return smppAccount;
	}
	public final void setSmppAccount(SmppAccountVO smppAccount) {
		this.smppAccount = smppAccount;
	}
	
}
