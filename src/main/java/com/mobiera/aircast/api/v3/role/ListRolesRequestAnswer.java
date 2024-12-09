package com.mobiera.aircast.api.v3.role;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.RoleVO;

@JsonInclude(Include.NON_NULL)
public class ListRolesRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2392798713620249354L;
	private ListRolesRequestResult result;
	private String errorMessage;
	private List<RoleVO> roles;
	public final ListRolesRequestResult getResult() {
		return result;
	}
	public final void setResult(ListRolesRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<RoleVO> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleVO> roles) {
		this.roles = roles;
	}
	
	
	
	


}
