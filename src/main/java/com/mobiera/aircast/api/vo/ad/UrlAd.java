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
public class UrlAd extends AdVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Text #1", 
			description="Text of Optin #1")
	@Validator(minSize=0, maxSize=272)
	private String text1;
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_WRITE, 
	label="Title #2", 
	description="Title of Url Action")
	@Required
	@Validator(minSize=1, maxSize=200)
	private String title2;
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Url", 
			description="Url")
	@Required
	@Validator(minSize=1, maxSize=200)
	private String url;
	
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Failover FlashSMS text", 
			description="Failover FlashSMS text")
	@Validator(minSize=0, maxSize=500)
	private String flashSmsText;
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_WRITE, 
			label="Failover SMS text", 
			description="Failover SMS text")
	@Validator(minSize=0, maxSize=500)
	private String smsText;
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.CHECKBOX, 
			mode = Mode.READ_WRITE, 
			label="Always send failover SMS", 
			description="Always send failover SMS")
	
	private Boolean alwaysSendSmsText;
	
	

	


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



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getFlashSmsText() {
		return flashSmsText;
	}



	public void setFlashSmsText(String flashSmsText) {
		this.flashSmsText = flashSmsText;
	}



	public String getSmsText() {
		return smsText;
	}



	public void setSmsText(String smsText) {
		this.smsText = smsText;
	}



	public Boolean getAlwaysSendSmsText() {
		return alwaysSendSmsText;
	}



	public void setAlwaysSendSmsText(Boolean alwaysSendSmsText) {
		this.alwaysSendSmsText = alwaysSendSmsText;
	}



	
	
	
}
