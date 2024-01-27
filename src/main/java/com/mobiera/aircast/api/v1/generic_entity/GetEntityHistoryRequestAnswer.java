package com.mobiera.aircast.api.v1.generic_entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.EntityHistoryVO;

@JsonInclude(Include.NON_NULL)
public class GetEntityHistoryRequestAnswer implements Serializable {
	

	private static final long serialVersionUID = 8765744603505042850L;
	
	private GetEntityHistoryRequestResult result;
	private String errorMessage;
	
	private EntityHistoryVO entityHistory;

	public GetEntityHistoryRequestResult getResult() {
		return result;
	}

	public void setResult(GetEntityHistoryRequestResult result) {
		this.result = result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public EntityHistoryVO getEntityHistory() {
		return entityHistory;
	}

	public void setEntityHistory(EntityHistoryVO entityHistory) {
		this.entityHistory = entityHistory;
	}
	
	
	
	
	
}
