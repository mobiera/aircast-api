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
public class UssdVO extends StkActionVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_WRITE, 
			label="Title", 
			description="Optional Title of USSD Action")
	@Required
	@Validator (minSize=1)
	private List<StkActionDataVO> title;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="USSD String", 
			description="USSD String")
	@Validator(maxSize=60)
	@Required
	private String ussdString;
	public String getUssdString() {
		return ussdString;
	}


	public void setUssdString(String ussdString) {
		this.ussdString = ussdString;
	}


	public List<StkActionDataVO> getTitle() {
		return title;
	}


	public void setTitle(List<StkActionDataVO> title) {
		this.title = title;
	}


	


	
}
