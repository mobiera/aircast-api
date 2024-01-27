package com.mobiera.aircast.api.v1.identifier;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.IdentifierVO;

@JsonInclude(Include.NON_NULL)
public class ListIdentifiersRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListIdentifiersRequestResult result;
	private String errorMessage;
	private List<IdentifierVO> identifiers;
	public final ListIdentifiersRequestResult getResult() {
		return result;
	}
	public final void setResult(ListIdentifiersRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<IdentifierVO> getIdentifiers() {
		return identifiers;
	}
	public void setIdentifiers(List<IdentifierVO> identifiers) {
		this.identifiers = identifiers;
	}
	
	
	
	


}
