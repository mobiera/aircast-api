package com.mobiera.aircast.api.v3.role;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.RoleVO;

@JsonInclude(Include.NON_NULL)
public class GetRoleRequestAnswer implements Serializable
{

	private static final long serialVersionUID = 5241060034966633233L;

	private GetRoleRequestResult result;
	private String errorMessage;
	private RoleVO role;
	public final GetRoleRequestResult getResult() {
		return result;
	}
	public final void setResult(GetRoleRequestResult result) {
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
