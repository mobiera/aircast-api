package com.mobiera.ms.mno.api.json;

import java.io.Serializable;

import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Condition;
import com.mobiera.commons.introspection.Conditions;
import com.mobiera.commons.introspection.DisplayWhen;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

public class MmsMedia implements Serializable {
	
	
	/*
	 * Set by front
	 */
	private String contentType;
	private String url;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name")
	@Validator(minSize=0, maxSize=40)
	
	private String name;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Visibility in Seconds", 
			description="Visibility in Seconds")
	
	@Validator(minValue="0", maxValue="15")
	private Integer visibilityInSeconds;
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVisibilityInSeconds() {
		return visibilityInSeconds;
	}
	public void setVisibilityInSeconds(Integer visibilityInSeconds) {
		this.visibilityInSeconds = visibilityInSeconds;
	}
}
