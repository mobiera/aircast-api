package com.mobiera.aircast.api.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.UI;

@JsonInclude(Include.NON_NULL)
public class StkStatVO implements Serializable
{
	private static final long serialVersionUID = -5906726068769019986L;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="View", 
			description="View")
	private Integer view;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Back", 
			description="Back")
	private Integer back;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Ok", 
			description="Ok")
	private Integer ok;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Cancel", 
			description="Cancel")
	private Integer cancel;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Timeout", 
			description="Timeout")
	private Integer timeout;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Error", 
			description="Error")
	private Integer error;
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private Float efficiency; // percent
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private Float probability; //
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private int startFrom; // 0-9999
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private int endTo; // 0-9999, > startFrom
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private Long entityId;
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_ONLY
			)
	private String statClass;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Efficiency", 
			description="Efficiency")
	private String efficiencyText;
	
	
	public Integer getView() {
		return view;
	}
	public void setView(Integer view) {
		this.view = view;
	}
	public Integer getBack() {
		return back;
	}
	public void setBack(Integer back) {
		this.back = back;
	}
	public Integer getOk() {
		return ok;
	}
	public void setOk(Integer ok) {
		this.ok = ok;
	}
	public Integer getCancel() {
		return cancel;
	}
	public void setCancel(Integer cancel) {
		this.cancel = cancel;
	}
	public Integer getTimeout() {
		return timeout;
	}
	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}
	public Integer getError() {
		return error;
	}
	public void setError(Integer error) {
		this.error = error;
	}
	public Float getEfficiency() {
		return efficiency;
	}
	public void setEfficiency(Float efficiency) {
		this.efficiency = efficiency;
	}
	public Float getProbability() {
		return probability;
	}
	public void setProbability(Float probability) {
		this.probability = probability;
	}
	public int getStartFrom() {
		return startFrom;
	}
	public void setStartFrom(int startFrom) {
		this.startFrom = startFrom;
	}
	public int getEndTo() {
		return endTo;
	}
	public void setEndTo(int endTo) {
		this.endTo = endTo;
	}
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}
	public String getStatClass() {
		return statClass;
	}
	public void setStatClass(String statClass) {
		this.statClass = statClass;
	}
	public String getEfficiencyText() {
		
		if (efficiency != null) {
			efficiencyText =  (String.format("%.2f", efficiency) + "%");
		}
		
		return efficiencyText;
	}
	public void setEfficiencyText(String efficiencyText) {
		this.efficiencyText = efficiencyText;
	}
	
	
	
	
	
	
	
}
