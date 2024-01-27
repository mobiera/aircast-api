package com.mobiera.aircast.api.v1.campaign.stk_action_data;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.StkActionDataVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveStkActionDataRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	private StkActionDataVO stkActionData;
	@JsonIgnore
	private UserContextVO userContext;
	
	public StkActionDataVO getStkActionData() {
		return stkActionData;
	}

	public void setStkActionData(StkActionDataVO stkActionData) {
		this.stkActionData = stkActionData;
	}

	public UserContextVO getUserContext() {
		return userContext;
	}

	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}

	
	

	
}
