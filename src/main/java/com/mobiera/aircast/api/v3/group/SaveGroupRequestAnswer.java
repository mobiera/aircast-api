package com.mobiera.aircast.api.v3.group;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.GroupVO;

@JsonInclude(Include.NON_NULL)
public class SaveGroupRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2697898713620249354L;
	private SaveGroupRequestResult result;
	private String errorMessage;
	private GroupVO group;
	public final SaveGroupRequestResult getResult() {
		return result;
	}
	public final void setResult(SaveGroupRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public GroupVO getGroup() {
		return group;
	}
	public void setGroup(GroupVO group) {
		this.group = group;
	}
	
}
