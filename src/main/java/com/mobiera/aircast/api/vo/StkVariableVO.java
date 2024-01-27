package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.enums.StkVariableType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.UI;

@JsonInclude(Include.NON_NULL)
public class StkVariableVO implements Serializable
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Variable Type", 
			description="Variable Type")
	@Required
	private StkVariableType variableType;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Value", 
			description="Value")
	@Required
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public StkVariableType getVariableType() {
		return variableType;
	}
	public void setVariableType(StkVariableType variableType) {
		this.variableType = variableType;
	}
	
	

	


	
}
