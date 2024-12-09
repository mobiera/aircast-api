package com.mobiera.aircast.api.v3.sender;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SenderVO;

@JsonInclude(Include.NON_NULL)
public class GetSenderRequestAnswer implements Serializable
{

	private static final long serialVersionUID = 5241160034966633214L;

	private GetSenderRequestResult result;
	private String errorMessage;
	private SenderVO sender;
	public final GetSenderRequestResult getResult() {
		return result;
	}
	public final void setResult(GetSenderRequestResult result) {
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
