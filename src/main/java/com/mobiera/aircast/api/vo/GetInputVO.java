package com.mobiera.aircast.api.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.enums.GetInputType;
import com.mobiera.aircast.commons.enums.Dcs;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class GetInputVO extends StkActionVO
{
	private static final long serialVersionUID = 1241060039976634233L;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_WRITE, 
			label="Title", 
			description="Title of Get Input")
	@Required
	@Validator (minSize=1)
	private List<StkActionDataVO> title;
	
	@Required
	@UI( widgetType = WidgetType.SELECT, 
		mode = Mode.READ_WRITE, 
		label="Type", 
		description="Type of Get Input")
	private GetInputType inputType;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Default Input", 
			description="Preloaded text for User input")
	@Validator(minValue="0", maxValue="60")
	private String defaultInput;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Min Size", 
			description="Min required size of User response")
	@Validator(minValue="0", maxValue="60")
	private Short minSize;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Max Size", 
			description="Max required size of User response")
	@Validator(minValue="0", maxValue="60")
	private Short maxSize;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Output Variable", 
			description="Variable where to store data input by User")
	@Required
	private String outputVariable;
	
	
	@Required
	@UI( widgetType = WidgetType.SELECT, 
		mode = Mode.READ_WRITE, 
		label="Output Dcs", 
		description="Force Output DCS. Recommended DCS_UCS2")
	@Validator(allowedValues= {"DCS_UCS2", "DCS_8_BIT_DATA"})
	private Dcs outputDcs;
	
	
	
	public List<StkActionDataVO> getTitle() {
		return title;
	}


	public void setTitle(List<StkActionDataVO> title) {
		this.title = title;
	}


	
	


	public String getDefaultInput() {
		return defaultInput;
	}


	public void setDefaultInput(String defaultInput) {
		this.defaultInput = defaultInput;
	}


	


	public String getOutputVariable() {
		return outputVariable;
	}


	public void setOutputVariable(String outputVariable) {
		this.outputVariable = outputVariable;
	}


	public Short getMinSize() {
		return minSize;
	}


	public void setMinSize(Short minSize) {
		this.minSize = minSize;
	}


	public Short getMaxSize() {
		return maxSize;
	}


	public void setMaxSize(Short maxSize) {
		this.maxSize = maxSize;
	}


	public Dcs getOutputDcs() {
		return outputDcs;
	}


	public void setOutputDcs(Dcs outputDcs) {
		this.outputDcs = outputDcs;
	}


	public GetInputType getInputType() {
		return inputType;
	}


	public void setInputType(GetInputType inputType) {
		this.inputType = inputType;
	}


	


	
	

}
