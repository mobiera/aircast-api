package com.mobiera.aircast.api.v3.sender;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SenderVO;

@JsonInclude(Include.NON_NULL)
public class ListSendersRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2392798703620238354L;
	private ListSendersRequestResult result;
	private String errorMessage;
	private List<SenderVO> senders;
	public final ListSendersRequestResult getResult() {
		return result;
	}
	public final void setResult(ListSendersRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<SenderVO> getSenders() {
		return senders;
	}
	public void setSenders(List<SenderVO> senders) {
		this.senders = senders;
	}
	
}
