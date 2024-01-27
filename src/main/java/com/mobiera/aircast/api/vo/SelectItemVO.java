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
public class SelectItemVO extends StkActionVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_WRITE, 
			label="Title", 
			description="Title that will be shown in Select Item")
	@Required
	@Validator (minSize=1)
	private List<StkActionDataVO> title;
	
	
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_WRITE, 
			label="Items", 
			description="Items")
	@Required
	@Validator (minSize=1)
	private List<StkActionItemVO> items;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Output Variable", 
			description="Variable where to store data selected by User")
	@Required
	private String outputVariable;
	
	
	
	public List<StkActionDataVO> getTitle() {
		return title;
	}
	public void setTitle(List<StkActionDataVO> title) {
		this.title = title;
	}
	public List<StkActionItemVO> getItems() {
		return items;
	}
	public void setItems(List<StkActionItemVO> items) {
		this.items = items;
	}
	public String getOutputVariable() {
		return outputVariable;
	}
	public void setOutputVariable(String outputVariable) {
		this.outputVariable = outputVariable;
	}
	
	
	
	
	
	
}
