package com.mobiera.aircast.api.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.UI;

@JsonInclude(Include.NON_NULL)
public class CallVO extends StkActionVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Tpda", 
			description="Number to call")
	@Required
	private String tpda;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_WRITE, 
			label="Title", 
			description="Optional Title of Call Action")
	private List<StkActionDataVO> title;
	
	
	

	public String getTpda() {
		return tpda;
	}



	public void setTpda(String tpda) {
		this.tpda = tpda;
	}



	public List<StkActionDataVO> getTitle() {
		return title;
	}



	public void setTitle(List<StkActionDataVO> title) {
		this.title = title;
	}


	

	


	
}
