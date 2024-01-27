package com.mobiera.aircast.api.v1.campaign.ad;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.UserContextVO;
import com.mobiera.aircast.api.vo.ad.AdVO;

@JsonInclude(Include.NON_NULL)
public class SaveAdRequest implements Serializable {

	private static final long serialVersionUID = -4486817586038514950L;
	
	private AdVO ad;
	@JsonIgnore
	private UserContextVO userContext;
	
	

	public UserContextVO getUserContext() {
		return userContext;
	}

	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}

	public AdVO getAd() {
		return ad;
	}

	public void setAd(AdVO ad) {
		this.ad = ad;
	}

	

	
}
