package com.mobiera.aircast.api.v1.vaservice;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.api.vo.VaServiceVO;

@JsonInclude(Include.NON_NULL)
public class SaveVaServiceRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private VaServiceVO vaService;
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	public VaServiceVO getVaService() {
		return vaService;
	}
	public void setVaService(VaServiceVO vaService) {
		this.vaService = vaService;
	}
	

	
	
}
