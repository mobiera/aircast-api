package com.mobiera.aircast.api.v1.campaign.stk_action_data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.StkActionDataVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveStkActionDatasRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	private List<StkActionDataVO> stkActionDatas;
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public UserContextVO getUserContext() {
		return userContext;
	}

	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}

	public List<StkActionDataVO> getStkActionDatas() {
		return stkActionDatas;
	}

	public void setStkActionDatas(List<StkActionDataVO> stkActionDatas) {
		this.stkActionDatas = stkActionDatas;
	}

	
	

	
}
