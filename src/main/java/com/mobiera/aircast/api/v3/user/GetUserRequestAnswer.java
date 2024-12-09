package com.mobiera.aircast.api.v3.user;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserVO;

@JsonInclude(Include.NON_NULL)
public class GetUserRequestAnswer implements Serializable
{

	private static final long serialVersionUID = 5241160034966633233L;

	private GetUserRequestResult result;
	private String errorMessage;
	private UserVO user;
	public final GetUserRequestResult getResult() {
		return result;
	}
	public final void setResult(GetUserRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public UserVO getUser() {
		return user;
	}
	public void setUser(UserVO user) {
		this.user = user;
	}
	
	
	


}
