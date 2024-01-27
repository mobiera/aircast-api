package com.mobiera.aircast.api.v1.campaign.stk_action_data;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.StkActionDataVO;

@JsonInclude(Include.NON_NULL)
public class SaveStkActionDatasRequestAnswer implements Serializable {

	private static final long serialVersionUID = 4267830307996294910L;
	private SaveStkActionDatasRequestResult result;
	private String errorMessage;
	private List<StkActionDataVO> stkActionDatas;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public SaveStkActionDatasRequestResult getResult() {
		return result;
	}
	public void setResult(SaveStkActionDatasRequestResult result) {
		this.result = result;
	}
	public List<StkActionDataVO> getStkActionDatas() {
		return stkActionDatas;
	}
	public void setStkActionDatas(List<StkActionDataVO> stkActionDatas) {
		this.stkActionDatas = stkActionDatas;
	}
	
}
