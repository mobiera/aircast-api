package com.mobiera.aircast.api.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class ConcatenateVO extends StkActionVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@UI( widgetType = WidgetType.TABLE, 
			mode = Mode.READ_WRITE, 
			label="Inputs", 
			description="Input variables to concatenate")
	@Required
	@Validator(minSize=1, maxSize=6)
	private List<StkVariableVO> inputs;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Output Variable", 
			description="Output Variable that will receive the result of concatenation")
	@Required
	private String outputVariable;
	
	
	public List<StkVariableVO> getInputs() {
		return inputs;
	}
	public void setInputs(List<StkVariableVO> inputs) {
		this.inputs = inputs;
	}
	public String getOutputVariable() {
		return outputVariable;
	}
	public void setOutputVariable(String outputVariable) {
		this.outputVariable = outputVariable;
	}
	
	
	
	
	

	


	
}
