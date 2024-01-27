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
public class TextAd extends AdVO
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
	@Required
	@UI( widgetType = WidgetType.TEXTAREA, 
	mode = Mode.READ_WRITE, 
	label="Text #2", 
	description="Text of Optin #2")
	@Validator(minSize=1, maxSize=272)
	private String text2;
	
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="keyword", 
			description="Text of SMS to send")
	@Validator(maxSize=50)
	private String mo;
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="shortcode", 
			description="Shortcode to send SMS to")
	@Validator(maxSize=50)
	private String tpda;
	
	public String getText1() {
		return text1;
	}
	public void setText1(String text1) {
		this.text1 = text1;
	}
	public String getText2() {
		return text2;
	}
	public void setText2(String text2) {
		this.text2 = text2;
	}
	public String getTpda() {
		return tpda;
	}
	public void setTpda(String tpda) {
		this.tpda = tpda;
	}
	public String getMo() {
		return mo;
	}
	public void setMo(String mo) {
		this.mo = mo;
	}
	

	
	
	
}
