package com.mobiera.aircast.api.v1.tp_rule;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.TpRuleVO;
import com.mobiera.aircast.api.vo.UserContextVO;

@JsonInclude(Include.NON_NULL)
public class SaveTpRuleRequest implements Serializable
{
	private static final long serialVersionUID = 1241060034966633233L;
	private TpRuleVO tpRule;
	
	@JsonIgnore
	private UserContextVO userContext;
	
	
	public final TpRuleVO getTpRule() {
		return tpRule;
	}
	public final void setTpRule(TpRuleVO tpRule) {
		this.tpRule = tpRule;
	}
	public UserContextVO getUserContext() {
		return userContext;
	}
	public void setUserContext(UserContextVO userContext) {
		this.userContext = userContext;
	}
	

	
	
}
