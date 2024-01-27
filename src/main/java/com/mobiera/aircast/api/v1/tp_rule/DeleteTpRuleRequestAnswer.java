package com.mobiera.aircast.api.v1.tp_rule;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.TpRuleVO;

@JsonInclude(Include.NON_NULL)
public class DeleteTpRuleRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6297798713620249354L;
	private DeleteTpRuleRequestResult result;
	private String errorMessage;
	private TpRuleVO tpRule;
	public final DeleteTpRuleRequestResult getResult() {
		return result;
	}
	public final void setResult(DeleteTpRuleRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final TpRuleVO getTpRule() {
		return tpRule;
	}
	public final void setTpRule(TpRuleVO tpRule) {
		this.tpRule = tpRule;
	}
	
	

}
