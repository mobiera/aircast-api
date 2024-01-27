package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.UI;


@Label(singular="Aircast Setting", plural="Aircast Settings")
@Description(data="Fully control Aircast features")
@JsonInclude(Include.NON_NULL)
public class ParameterVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4829352845298862370L;

	
	
	@Required
	@UI( widgetType = WidgetType.TEXT, 
	mode = Mode.READ_ONLY)
	private String name;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE)
	private String value;
	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY)
	private String type;
	private String label;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY)
	private String description;
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getValue() {
		return value;
	}
	public final void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	
}
