package com.mobiera.aircast.api.v1.campaign.ad;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.ad.AdVO;

@JsonInclude(Include.NON_NULL)
public class SaveAdRequestAnswer implements Serializable {

	private static final long serialVersionUID = 4267830307996294910L;
	private SaveAdRequestResult result;
	private String errorMessage;
	private AdVO ad;
	public SaveAdRequestResult getResult() {
		return result;
	}
	public void setResult(SaveAdRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public AdVO getAd() {
		return ad;
	}
	public void setAd(AdVO ad) {
		this.ad = ad;
	}
	
	
}
