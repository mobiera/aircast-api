package com.mobiera.aircast.api.v3.group;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.GroupVO;

@JsonInclude(Include.NON_NULL)
public class ListGroupsRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2392898713620249354L;
	private ListGroupsRequestResult result;
	private String errorMessage;
	private List<GroupVO> groups;
	public final ListGroupsRequestResult getResult() {
		return result;
	}
	public final void setResult(ListGroupsRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<GroupVO> getGroups() {
		return groups;
	}
	public void setGroups(List<GroupVO> groups) {
		this.groups = groups;
	}
	
	
	
	


}
