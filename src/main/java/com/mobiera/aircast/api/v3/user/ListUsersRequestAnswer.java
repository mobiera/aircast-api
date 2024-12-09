package com.mobiera.aircast.api.v3.user;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserVO;

@JsonInclude(Include.NON_NULL)
public class ListUsersRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2392798703620249354L;
	private ListUsersRequestResult result;
	private String errorMessage;
	private List<UserVO> users;
	public final ListUsersRequestResult getResult() {
		return result;
	}
	public final void setResult(ListUsersRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<UserVO> getUsers() {
		return users;
	}
	public void setUsers(List<UserVO> users) {
		this.users = users;
	}
	
	
	
	


}
