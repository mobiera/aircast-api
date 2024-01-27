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
public class MoVO extends StkActionVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Tpda", 
			description="Target number to which device will send the MO")
	private String tpda;
	
	
	@UI( widgetType = WidgetType.TABLE, 
			mode = Mode.READ_WRITE, 
			label="Inputs", 
			description="Input variables to concatenate that will be sent as a MO")
	@Required
	@Validator(minSize=1, maxSize=6)
	private List<StkVariableVO> inputs;
	
	public String getTpda() {
		return tpda;
	}
	public void setTpda(String tpda) {
		this.tpda = tpda;
	}
	public List<StkVariableVO> getInputs() {
		return inputs;
	}
	public void setInputs(List<StkVariableVO> inputs) {
		this.inputs = inputs;
	}
	


	

	


	
}
