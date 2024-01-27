package com.mobiera.aircast.api.v1.sleepy.action;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.introspection.Required;

@JsonInclude(Include.NON_NULL)
public class VariableReference extends InputData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4875978506962408639L;
	
	@Required
	private Variable variable;

	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}
	
	

	
	
}