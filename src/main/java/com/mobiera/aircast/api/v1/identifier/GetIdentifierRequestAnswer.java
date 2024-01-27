package com.mobiera.aircast.api.v1.identifier;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.IdentifierVO;

@JsonInclude(Include.NON_NULL)
public class GetIdentifierRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3297798713620249354L;
	private GetIdentifierRequestResult result;
	private String errorMessage;
	private IdentifierVO identifier;
	public final GetIdentifierRequestResult getResult() {
		return result;
	}
	public final void setResult(GetIdentifierRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public IdentifierVO getIdentifier() {
		return identifier;
	}
	public void setIdentifier(IdentifierVO identifier) {
		this.identifier = identifier;
	}
	
	
	


}
