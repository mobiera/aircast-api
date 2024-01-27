package com.mobiera.aircast.api.vo.ad;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class MenuAdItem implements Serializable {
	
	private static final long serialVersionUID = -3288136543847941945L;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Item Label", 
			description="Item Label")
	@Validator(minSize=1, maxSize=50)
	@Required
	private String text;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Item Value", 
			description="Item Value")
	@Validator(minSize=1, maxSize=50)
	@Required
	private String value;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="keyword", 
			description="Text of SMS to send")
	@Validator(minSize=1, maxSize=50)
	private String mo;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="shortcode", 
			description="Shortcode to send SMS to")
	@Validator(minSize=1, maxSize=15)
	private String tpda;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getMo() {
		return mo;
	}
	public void setMo(String mo) {
		this.mo = mo;
	}
	public String getTpda() {
		return tpda;
	}
	public void setTpda(String tpda) {
		this.tpda = tpda;
	}
	
}