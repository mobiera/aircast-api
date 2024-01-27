package com.mobiera.aircast.api.vo.ad;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class CallAd extends AdVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Text #1", 
			description="Text of Optin #1")
	@Validator(minSize=0, maxSize=272)
	private String text1;
	
	
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Title #2", 
			description="Title of Call Action")
	@Required
	@Validator(minSize=1, maxSize=200)
	private String title2;
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Number to call", 
			description="Number to call")
	@Required
	private String tpda;
	
	
	public String getText1() {
		return text1;
	}



	public void setText1(String text1) {
		this.text1 = text1;
	}



	public String getTitle2() {
		return title2;
	}



	public void setTitle2(String title2) {
		this.title2 = title2;
	}



	public String getTpda() {
		return tpda;
	}



	public void setTpda(String tpda) {
		this.tpda = tpda;
	}



	
}
