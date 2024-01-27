package com.mobiera.aircast.api.v1.sim_profile;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.SimProfileVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveSimProfileRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private SimProfileVO simProfile;
	@JsonIgnore
	private UserContextVO userContext;
	
	public final SimProfileVO getSimProfile() {
		return simProfile;
	}
	public final void setSimProfile(SimProfileVO simProfile) {
		this.simProfile = simProfile;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	

	
	
}
