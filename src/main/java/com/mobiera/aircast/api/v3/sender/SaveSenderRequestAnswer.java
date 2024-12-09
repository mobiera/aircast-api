package com.mobiera.aircast.api.v3.sender;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SenderVO;

@JsonInclude(Include.NON_NULL)
public class SaveSenderRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2697199813620249354L;
	private SaveSenderRequestResult result;
	private String errorMessage;
	private SenderVO sender;
	public final SaveSenderRequestResult getResult() {
		return result;
	}
	public final void setResult(SaveSenderRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public SenderVO getSender() {
		return sender;
	}
	public void setSender(SenderVO sender) {
		this.sender = sender;
	}
	
}
