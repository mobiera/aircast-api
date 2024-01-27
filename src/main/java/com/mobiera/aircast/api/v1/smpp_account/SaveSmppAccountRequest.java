package com.mobiera.aircast.api.v1.smpp_account;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SmppAccountVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveSmppAccountRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private SmppAccountVO smppAccount;
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public final SmppAccountVO getSmppAccount() {
		return smppAccount;
	}
	public final void setSmppAccount(SmppAccountVO smppAccount) {
		this.smppAccount = smppAccount;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	

	
	
}
