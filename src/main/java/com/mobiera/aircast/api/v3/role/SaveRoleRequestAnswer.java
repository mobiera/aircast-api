package com.mobiera.aircast.api.v3.role;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.RoleVO;

@JsonInclude(Include.NON_NULL)
public class SaveRoleRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2697798713620249354L;
	private SaveRoleRequestResult result;
	private String errorMessage;
	private RoleVO role;
	public final SaveRoleRequestResult getResult() {
		return result;
	}
	public final void setResult(SaveRoleRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public RoleVO getRole() {
		return role;
	}
	public void setRole(RoleVO role) {
		this.role = role;
	}
	
}
