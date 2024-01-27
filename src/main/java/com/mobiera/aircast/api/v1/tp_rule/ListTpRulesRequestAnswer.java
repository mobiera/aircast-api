package com.mobiera.aircast.api.v1.tp_rule;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.TpRuleVO;

@JsonInclude(Include.NON_NULL)
public class ListTpRulesRequestAnswer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3292798713620249354L;
	private ListTpRulesRequestResult result;
	private String errorMessage;
	private List<TpRuleVO> tpRules;
	public final ListTpRulesRequestResult getResult() {
		return result;
	}
	public final void setResult(ListTpRulesRequestResult result) {
		this.result = result;
	}
	public final String getErrorMessage() {
		return errorMessage;
	}
	public final void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public final List<TpRuleVO> getTpRules() {
		return tpRules;
	}
	public final void setTpRules(List<TpRuleVO> tpRules) {
		this.tpRules = tpRules;
	}
	
	
	


}
