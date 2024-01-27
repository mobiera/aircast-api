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
public class MoAd extends AdVO
{
	private static final long serialVersionUID = 1241060039976633233L;
	
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="keyword", 
			description="Text of SMS to send")
	@Validator(minSize=1, maxSize=50)
	@Required
	private String mo;
	@Section(name = "CREATIVES")
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="shortcode", 
			description="Shortcode to send SMS to")
	@Validator(minSize=1, maxSize=15)
	@Required
	private String tpda;
	
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
