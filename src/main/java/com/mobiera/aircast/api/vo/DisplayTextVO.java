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
public class DisplayTextVO extends StkActionVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_WRITE, 
			label="Text", 
			description="Text that will be shown in Display Text")
	@Required
	@Validator (minSize=1)
	private List<StkActionDataVO> text;


	public List<StkActionDataVO> getText() {
		return text;
	}


	public void setText(List<StkActionDataVO> text) {
		this.text = text;
	}
	
	
}
