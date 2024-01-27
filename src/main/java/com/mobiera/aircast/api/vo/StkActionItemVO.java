package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.UI;

@JsonInclude(Include.NON_NULL)
public class StkActionItemVO implements Serializable {
	
	private static final long serialVersionUID = -3288136543847941945L;

	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY)
	private Long id;
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY)
	private Long actionId;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Text", 
			description="Text")
	@Required
	private String text;
	//private Short idx;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Value", 
			description="Value")
	private String value;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Ok Action", 
			description="If User selects this Item, go to this Action")
	
	private String okAction;
	
	private Integer view;
	private Integer ok;
	
	private String statLabel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
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
	public String getOkAction() {
		return okAction;
	}
	public void setOkAction(String okAction) {
		this.okAction = okAction;
	}
	
	public Long getActionId() {
		return actionId;
	}
	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}
	public Integer getView() {
		return view;
	}
	public void setView(Integer view) {
		this.view = view;
	}
	
	public Integer getOk() {
		return ok;
	}
	public void setOk(Integer ok) {
		this.ok = ok;
	}
	public String getStatLabel() {
		return statLabel;
	}
	public void setStatLabel(String statLabel) {
		this.statLabel = statLabel;
	}
	
}